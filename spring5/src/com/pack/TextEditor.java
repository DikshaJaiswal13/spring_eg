package com.pack;
//pojo or bean class
public class TextEditor {
private SpellChecker spellChecker;//object of SpellChecker class

public SpellChecker getSpellChecker() {
	return spellChecker;
}

public void setSpellChecker(SpellChecker spellChecker) {
	this.spellChecker = spellChecker;
}
public void test(){
	spellChecker.checkSpelling();
}
}
