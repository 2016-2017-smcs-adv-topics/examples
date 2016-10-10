package smcs.battis.game;

import java.awt.*;
import java.awt.event.*;

import objectdraw.*;

public class PlayableCharacter extends Character {

	protected KeyboardManager key;
	protected KeyboardBinding binding;
	
	public PlayableCharacter(Image avatar, Location startingOrigin, World world, KeyboardManager key, KeyboardBinding binding) {
		super(avatar, startingOrigin, world);
		this.key = key;
		this.binding = binding;
	}
	
	public void takeAStep() {
		if (key.isPressed(binding.up())) {
			move(0, -stride);
		}
		if (key.isPressed(binding.down())) {
			move(0, stride);
		}
		if (key.isPressed(binding.left())) {
			move(-stride, 0);
		}
		if (key.isPressed(binding.right())) {
			move(stride, 0);
		}
	}
}
