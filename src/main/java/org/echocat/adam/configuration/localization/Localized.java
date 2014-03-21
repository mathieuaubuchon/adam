/*****************************************************************************************
 * *** BEGIN LICENSE BLOCK *****
 *
 * echocat Adam, Copyright (c) 2014 echocat
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 *
 * *** END LICENSE BLOCK *****
 ****************************************************************************************/

package org.echocat.adam.configuration.localization;

import org.echocat.adam.configuration.IdEnabled;

import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

import static org.echocat.adam.configuration.ConfigurationContants.SCHEMA_NAMESPACE;

@XmlType(name = "localized", namespace = SCHEMA_NAMESPACE)
public abstract class Localized extends IdEnabled {

    @Nullable
    private List<Localization> _localizations;

    @Nullable
    @XmlElement(name = "localization", namespace = SCHEMA_NAMESPACE)
    public List<Localization> getLocalizations() {
        return _localizations;
    }

    public void setLocalizations(@Nullable List<Localization> localizations) {
        _localizations = localizations;
    }


}
