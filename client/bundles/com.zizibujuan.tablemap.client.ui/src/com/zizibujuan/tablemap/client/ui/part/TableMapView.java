package com.zizibujuan.tablemap.client.ui.part;

import javax.inject.Inject;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class TableMapView {

	private ScrollingGraphicalViewer viewer;
	@Inject
	public TableMapView(Composite parent){
		viewer = new ScrollingGraphicalViewer();
		viewer.createControl(parent);    
		viewer.setRootEditPart(new ScalableFreeformRootEditPart());      
		viewer.getControl().setBackground(ColorConstants.white);      
		//return (FigureCanvas) viewer.getControl();
	}
}
