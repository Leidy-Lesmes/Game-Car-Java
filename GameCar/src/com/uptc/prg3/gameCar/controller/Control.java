package com.uptc.prg3.gameCar.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.uptc.prg3.gameCar.model.GameManager;
import com.uptc.prg3.gameCar.viewer.JFrameCar;

public class Control implements ActionListener, KeyListener{

	private GameManager gameManager;
	private JFrameCar jFrameCar;
	
	public Control() {
		this.gameManager = new GameManager();
		this.jFrameCar = new JFrameCar();
	}
	
	@Override
    public void keyPressed(KeyEvent e) {
        int code = e.getExtendedKeyCode();
        switch (code) {
            case KeyEvent.VK_LEFT:
            	//
            	break;
            case KeyEvent.VK_RIGHT:
            	//
            	break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) { }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) { }
}
