The InstrumentPlayer class play method needs to be modified every time you want to add 
a new instrument.
By separating each instrument if block in a separate class, all sharing the Instrument interface, 
the InstrumentPlayer doesn't need to be modified to add a new instrument.