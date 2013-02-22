package com.globant.sonarplugins.buildbreakers;

import com.google.common.collect.ImmutableList;
import org.sonar.api.BatchExtension;
import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.PropertyField;
import org.sonar.api.PropertyType;
import org.sonar.api.SonarPlugin;
import com.globant.sonarplugins.buildbreakers.BuildBreakersWidget;

import java.util.List;


public final class BuildBreakersPlugin extends SonarPlugin {
  @SuppressWarnings("unchecked")
  public List getExtensions() {
    return ImmutableList.of(
		BuildBreakersWidget.class
		);
  }
}
