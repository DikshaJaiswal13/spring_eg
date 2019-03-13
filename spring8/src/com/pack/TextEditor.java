package com.pack;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
private SpellChecker spell;//spell is the property name

/*public SpellChecker getSpell() {
	return spell;
}
@Autowired
public void setSpell(SpellChecker spell) {
	this.spell = spell;
}*/
public void test(){
	spell.checkSpelling();
}
@Autowired /*autowire using constructor*/
public TextEditor(SpellChecker spell) {
	super();
	this.spell = spell;
	System.out.println("inside textEditor constructor");
}
}
