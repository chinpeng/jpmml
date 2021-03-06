/*
 * Copyright (c) 2013 Villu Ruusmann
 */
package org.jpmml.evaluator;

import org.dmg.pmml.*;

abstract
public class RegressionModelEvaluatorTest extends PMMLTest {

	public RegressionModelEvaluator createEvaluator() throws Exception {
		PMML pmml = loadPMML(getClass());

		RegressionModelEvaluator evaluator = new RegressionModelEvaluator(pmml);

		return evaluator;
	}
}