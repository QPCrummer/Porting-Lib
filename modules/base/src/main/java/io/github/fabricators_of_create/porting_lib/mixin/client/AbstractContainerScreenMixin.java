package io.github.fabricators_of_create.porting_lib.mixin.client;

import com.llamalad7.mixinextras.sugar.Local;

import io.github.fabricators_of_create.porting_lib.extensions.GuiGraphicsExtension;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.minecraft.world.item.ItemStack;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractContainerScreen.class)
public class AbstractContainerScreenMixin {

	@Inject(method = "renderTooltip", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphics;renderTooltip(Lnet/minecraft/client/gui/Font;Ljava/util/List;Ljava/util/Optional;II)V"))
	public void port_lib$preRenderTooltip(final GuiGraphics guiGraphics, final int i, final int j, final CallbackInfo ci, @Local ItemStack stack) {
		((GuiGraphicsExtension) guiGraphics).port_lib$setTooltipStack(stack);
	}

	@Inject(method = "renderTooltip", at = @At(value = "TAIL"))
	public void port_lib$postRenderTooltip(final GuiGraphics guiGraphics, final int i, final int j, final CallbackInfo ci) {
		((GuiGraphicsExtension) guiGraphics).port_lib$setTooltipStack(ItemStack.EMPTY);
	}
}
