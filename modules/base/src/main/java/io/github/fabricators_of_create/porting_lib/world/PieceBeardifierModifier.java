package io.github.fabricators_of_create.porting_lib.world;

import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.TerrainAdjustment;

/** Implement this interface in a {@link net.minecraft.world.level.levelgen.structure.StructurePiece} class extension to modify its {@link net.minecraft.world.level.levelgen.Beardifier} behavior. */
public interface PieceBeardifierModifier {
	BoundingBox getBeardifierBox();

	TerrainAdjustment getTerrainAdjustment();

	int getGroundLevelDelta();
}
