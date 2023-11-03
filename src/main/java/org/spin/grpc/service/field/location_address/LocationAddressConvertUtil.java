/************************************************************************************
 * Copyright (C) 2018-present E.R.P. Consultores y Asociados, C.A.                  *
 * Contributor(s): Edwin Betancourt, EdwinBetanc0urt@outlook.com                    *
 * This program is free software: you can redistribute it and/or modify             *
 * it under the terms of the GNU General Public License as published by             *
 * the Free Software Foundation, either version 2 of the License, or                *
 * (at your option) any later version.                                              *
 * This program is distributed in the hope that it will be useful,                  *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of                   *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the                     *
 * GNU General Public License for more details.                                     *
 * You should have received a copy of the GNU General Public License                *
 * along with this program. If not, see <https://www.gnu.org/licenses/>.            *
 ************************************************************************************/
package org.spin.grpc.service.field.location_address;

import org.adempiere.core.domains.models.I_C_Country;
import org.compiere.model.MCountry;
import org.compiere.model.MLocation;
import org.spin.backend.grpc.field.location_address.Address;
import org.spin.backend.grpc.field.location_address.Country;
import org.spin.service.grpc.util.value.ValueManager;

public class LocationAddressConvertUtil {

	public static Country.Builder convertCountry(MCountry country) {
		Country.Builder builder = Country.newBuilder();
		if (country == null || country.getC_Country_ID() <= 0) {
			return builder;
		}

		builder.setId(country.getC_Country_ID())
			.setUuid(
				ValueManager.validateNull(
					country.getUUID()
				)
			)
			.setCountryCode(
				ValueManager.validateNull(
					country.getCountryCode()
				)
			)
			.setName(
				ValueManager.validateNull(
					country.get_Translation(
						I_C_Country.COLUMNNAME_Name
					)
				)
			)
			.setIsHasRegion(
				country.isHasRegion()
			)
			.setRegionName(
				ValueManager.validateNull(
					country.get_Translation(
						I_C_Country.COLUMNNAME_RegionName
					)
				)
			)
			.setCaptureSequence(
				ValueManager.validateNull(
					country.getCaptureSequence()
				)
			)
			.setDisplaySequence(
				ValueManager.validateNull(
					country.getDisplaySequence()
				)
			)
			.setIsAddressLinesReverse(
				country.isAddressLinesReverse()
			)
			.setDisplaySequenceLocal(
				ValueManager.validateNull(
					country.getDisplaySequenceLocal()
				)
			)
			.setIsAddressLinesLocalReverse(
				country.isAddressLinesLocalReverse()
			)
			.setExpressionPostalCode(
				ValueManager.validateNull(
					country.getExpressionPostal()
				)
			)
			.setIsHasPostalCodeAdditional(
				country.isHasPostal_Add()
			)
			.setExpressionPostalCodeAdditional(
				ValueManager.validateNull(
					country.getExpressionPostal_Add()
				)
			)
			.setIsAllowCitiesOutOfList(
				country.isAllowCitiesOutOfList()
			)
		;
		return builder;
	}


	public static Address.Builder convertAddress(MLocation address) {
		Address.Builder builder = Address.newBuilder();
		if (address == null) {
			return builder;
		}
		builder.setId(address.getC_Location_ID())
			.setUuid(
				ValueManager.validateNull(
					address.getUUID()
				)
			)
			.setCountryId(
				address.getC_Country_ID()
			)
			.setRegionId(
				address.getC_Region_ID()
			)
			.setCityId(
				address.getC_City_ID()
			)
			.setCity(
				ValueManager.validateNull(
					address.getCity()
				)
			)
			.setAddress1(
				ValueManager.validateNull(
					address.getAddress1()
				)
			)
			.setAddress2(
				ValueManager.validateNull(
					address.getAddress2()
				)
			)
			.setAddress3(
				ValueManager.validateNull(
					address.getAddress3()
				)
			)
			.setAddress4(
				ValueManager.validateNull(
					address.getAddress4()
				)
			)
			.setPostalCode(
				ValueManager.validateNull(
					address.getPostal()
				)
			)
			.setPostalCodeAdditional(
				ValueManager.validateNull(
					address.getPostal_Add()
				)
			)
		;

		return builder;
	}
}
