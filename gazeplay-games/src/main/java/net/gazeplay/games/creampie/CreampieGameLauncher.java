package net.gazeplay.games.creampie;

import javafx.scene.Scene;
import net.gazeplay.GameLifeCycle;
import net.gazeplay.GameSpec;
import net.gazeplay.IGameContext;
import net.gazeplay.commons.utils.stats.Stats;

public class CreampieGameLauncher implements GameSpec.GameLauncher {
    @Override
    public Stats createNewStats(Scene scene) {
        return new CreampieStats(scene);
    }

    @Override
    public GameLifeCycle createNewGame(IGameContext gameContext, GameSpec.GameVariant gameVariant,
                                       Stats stats) {
        return new CreamPie(gameContext, stats);
    }
}
