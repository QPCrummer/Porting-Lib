package io.github.fabricators_of_create.porting_lib.transfer.fluid;

import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.minecraft.core.Direction;

import javax.annotation.Nullable;

public interface FluidTransferable {
	Storage<FluidVariant> getStorage(@Nullable Direction face);
}
