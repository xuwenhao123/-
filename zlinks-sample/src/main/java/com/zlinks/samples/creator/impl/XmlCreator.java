package com.zlinks.samples.creator.impl;

import com.zlinks.samples.ModuleEnum;
import com.zlinks.samples.bean.Conf;
import com.zlinks.samples.bean.Constants;
import com.zlinks.samples.bean.TableInfo;
import com.zlinks.samples.creator.AbstractFileCreator;

/**
 * 创建xml映射文件
 *
 * @author zhangjh
 */
public class XmlCreator extends AbstractFileCreator {
	private static XmlCreator creator;

	private XmlCreator() {
		super();
	}

	private XmlCreator(Conf conf) {
		super();
		init(conf);
	}

	public static synchronized XmlCreator getInstance(Conf conf) {
		if (null == creator) {
			creator = new XmlCreator(conf);
		}
		return creator;
	}

	@Override
	public String getFileName(TableInfo tableInfo) {
		return tableInfo.getBeanName() + conf.getMapperXmlName() + Constants.XML_SUFFIX;
	}

	@Override
	public String getTempletName() {
		return ModuleEnum.MapperXML.name() + Constants.TEMPLET_SUFFIX;
	}

	@Override
	public String getDirPath() {
		return resourcesbasePath + conf.getXml_dir();
	}

	@Override
	public void setPackageName(TableInfo tableInfo) {
	}

}
