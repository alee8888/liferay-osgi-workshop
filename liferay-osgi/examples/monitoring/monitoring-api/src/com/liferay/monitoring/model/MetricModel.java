/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.monitoring.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Metric service. Represents a row in the &quot;Metric&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.monitoring.model.impl.MetricModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.monitoring.model.impl.MetricImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Metric
 * @see com.liferay.monitoring.model.impl.MetricImpl
 * @see com.liferay.monitoring.model.impl.MetricModelImpl
 * @generated
 */
@ProviderType
public interface MetricModel extends BaseModel<Metric> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a metric model instance should use the {@link Metric} interface instead.
	 */

	/**
	 * Returns the primary key of this metric.
	 *
	 * @return the primary key of this metric
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this metric.
	 *
	 * @param primaryKey the primary key of this metric
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this metric.
	 *
	 * @return the uuid of this metric
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this metric.
	 *
	 * @param uuid the uuid of this metric
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the metric ID of this metric.
	 *
	 * @return the metric ID of this metric
	 */
	public long getMetricId();

	/**
	 * Sets the metric ID of this metric.
	 *
	 * @param metricId the metric ID of this metric
	 */
	public void setMetricId(long metricId);

	/**
	 * Returns the metric name of this metric.
	 *
	 * @return the metric name of this metric
	 */
	@AutoEscape
	public String getMetricName();

	/**
	 * Sets the metric name of this metric.
	 *
	 * @param metricName the metric name of this metric
	 */
	public void setMetricName(String metricName);

	/**
	 * Returns the metric value of this metric.
	 *
	 * @return the metric value of this metric
	 */
	public long getMetricValue();

	/**
	 * Sets the metric value of this metric.
	 *
	 * @param metricValue the metric value of this metric
	 */
	public void setMetricValue(long metricValue);

	/**
	 * Returns the create date of this metric.
	 *
	 * @return the create date of this metric
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this metric.
	 *
	 * @param createDate the create date of this metric
	 */
	public void setCreateDate(Date createDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.monitoring.model.Metric metric);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.monitoring.model.Metric> toCacheModel();

	@Override
	public com.liferay.monitoring.model.Metric toEscapedModel();

	@Override
	public com.liferay.monitoring.model.Metric toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}