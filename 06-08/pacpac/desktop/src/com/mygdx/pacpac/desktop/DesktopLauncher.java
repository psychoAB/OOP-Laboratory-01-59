package com.mygdx.pacpac.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.pacpac.Pacpac;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.width = Pacpac.WIDTH;
                config.height = Pacpac.HEIGHT;
		new LwjglApplication(new Pacpac(), config);
	}
}
