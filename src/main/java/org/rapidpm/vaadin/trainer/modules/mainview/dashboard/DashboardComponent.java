package org.rapidpm.vaadin.trainer.modules.mainview.dashboard;

import org.rapidpm.vaadin.trainer.modules.AbstractBaseCustomComponent;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;

/**
 *
 */
public class DashboardComponent extends AbstractBaseCustomComponent {

  @Override
  protected Component createComponent() {
    return new Label("Dashboard");
  }
}
