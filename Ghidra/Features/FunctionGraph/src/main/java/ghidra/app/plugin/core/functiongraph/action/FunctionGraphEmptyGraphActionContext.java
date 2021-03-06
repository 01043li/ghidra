/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.app.plugin.core.functiongraph.action;

import ghidra.app.context.ProgramActionContext;
import ghidra.app.plugin.core.functiongraph.FGProvider;
import ghidra.graph.viewer.actions.VisualGraphActionContext;

public class FunctionGraphEmptyGraphActionContext extends ProgramActionContext
		implements VisualGraphActionContext {

	public FunctionGraphEmptyGraphActionContext(FGProvider functionGraphProvider) {
		super(functionGraphProvider, functionGraphProvider.getProgram());
	}

	@Override
	public boolean shouldShowSatelliteActions() {
		return true;
	}
}
