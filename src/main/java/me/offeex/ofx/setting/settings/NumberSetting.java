package me.offeex.ofx.setting.settings;

import me.offeex.ofx.Main;
import me.offeex.ofx.module.Module;
import me.offeex.ofx.setting.Setting;

public class NumberSetting extends Setting {
	public double value;
	public double minimum;
	public double maximum;
	public double increment;
	  
	public NumberSetting(String name, Module parent, double value, double minimum, double maximum, double increment) {
		this.setName(name);
	    this.setParentMod(parent);
	    this.value = value;
	    this.minimum = minimum;
	    this.maximum = maximum;
	    this.increment = increment;
	  }
	  
	public double getValue() {
	    return this.value;
	}
	  
	public void setValue(double value) {
	    double precision = 1.0D / this.increment;
	    //this.value = value;
	    this.value = Math.round(Math.max(this.minimum, Math.min(this.maximum, value)) * precision) / precision;
	    
//	    if(Main.saveLoad != null) {
//			Main.saveLoad.save();
//	    }
	}
	 
	public void increment(boolean positive) {
	    setValue(getValue() + (positive ? 1 : -1) * increment);
	}
	  
	public double getMinimum() {
	    return this.minimum;
	}

	public void setMinimum(double minimum) {
	    this.minimum = minimum;
	}
	  
	public double getMaximum() {
	    return this.maximum;
	}
	
	public void setMaximum(double maximum) {
	    this.maximum = maximum;
	}
	  
	public double getIncrement() {
	    return this.increment;
	}
	  
	public void setIncrement(double increment) {
	    this.increment = increment;
	}
}