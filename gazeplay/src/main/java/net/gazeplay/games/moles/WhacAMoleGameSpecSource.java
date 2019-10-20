package net.gazeplay.games.moles;

import net.gazeplay.GameCategories;
import net.gazeplay.GameSpec;
import net.gazeplay.GameSummary;
import net.gazeplay.gameslocator.GameSpecSource;

public class WhacAMoleGameSpecSource implements GameSpecSource {
	@Override
	public GameSpec getGameSpec() {
		return new GameSpec(
				new GameSummary("WhacAmole", "data/Thumbnails/mole.png", GameCategories.Category.ACTION_REACTION),
				new WhacAMoleGameLauncher());
	}
}
