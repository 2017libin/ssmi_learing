/**
 * @Title: MyTypeFilter.java
 * @Package cn.osxm.ssmi.chp05.anno
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月17日 下午12:22:37
 * @version V1.0
 */

package cn.osxm.ssmi.chp05.anno;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

/**
 * @ClassName: MyTypeFilter
 * @Description: TODO
 * @author osxm:oscarxueming
 */

public class MyTypeFilter implements TypeFilter {
	@SuppressWarnings("unused")
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		Resource resource = metadataReader.getResource();
		String className = classMetadata.getClassName();
		System.out.println("Class:--->" + className);
		if (className.contains("UserController")) {
			return true;
		}
		return false;
	}
}
