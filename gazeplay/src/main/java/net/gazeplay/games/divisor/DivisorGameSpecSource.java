package net.gazeplay.games.divisor;

import net.gazeplay.GameCategories;
import net.gazeplay.GameSpec;
import net.gazeplay.GameSummary;
import net.gazeplay.gameslocator.GameSpecSource;

public class DivisorGameSpecSource implements GameSpecSource {
	@Override
	public GameSpec getGameSpec() {
		return new GameSpec(
				new GameSummary("Divisor", "data/Thumbnails/divisor.png", GameCategories.Category.SELECTION),
				new DivisorGameLauncher());
	}
}
