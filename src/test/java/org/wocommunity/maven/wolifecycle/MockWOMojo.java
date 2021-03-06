/**
 * Copyright (C) 2001 WOCommunity <contact@wocommunity.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.wocommunity.maven.wolifecycle;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.wocommunity.maven.wolifecycle.AbstractWOMojo;

/**
 * Only to test methods on abstract class
 * 
 * @author <a href="mailto:hprange@gmail.com">Henrique Prange</a>
 */
public class MockWOMojo extends AbstractWOMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
	// Do nothing
    }

    @Override
    public String getProductExtension() {
	return null;
    }

    @Override
    public MavenProject getProject() {
	return null;
    }
}
