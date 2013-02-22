package com.globant.sonarplugins.buildbreakers;
 
import org.sonar.api.web.*;
@WidgetCategory("Globant")
@WidgetProperties({
  @WidgetProperty(key = "LastBreakers", type = WidgetPropertyType.INTEGER, defaultValue = "4")
})
public final class BuildBreakersWidget extends AbstractRubyTemplate implements RubyRailsWidget {
  public String getId() {
    return "buildbreakers_widget";
  }
  public String getTitle() {
    return "Build Breakers Violations Widget";
  }
  protected String getTemplatePath() {
    return "/com/globant/sonarplugins/buildbreakers/buildbreakers_widget.html.erb";
  }
}