/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) [2017-2018] Payara Foundation and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://github.com/payara/Payara/blob/master/LICENSE.txt
 * See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * The Payara Foundation designates this particular file as subject to the "Classpath"
 * exception as provided by the Payara Foundation in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package fish.payara.nucleus.microprofile.config.spi;

import org.glassfish.api.admin.config.ConfigExtension;
import org.jvnet.hk2.config.Attribute;
import org.jvnet.hk2.config.ConfigBeanProxy;
import org.jvnet.hk2.config.Configured;

/**
 * @since 4.1.2.173
 * @author Steve Millidge (Payara Foundation)
 */
@Configured(name="microprofile-config")
public interface MicroprofileConfigConfiguration extends ConfigBeanProxy, ConfigExtension {
    
    @Attribute(defaultValue = "110", dataType = Integer.class)
    String getDomainOrdinality();
    public void setDomainOrdinality(String message);

    @Attribute(defaultValue = "120", dataType = Integer.class)
    String getConfigOrdinality();
    public void setConfigOrdinality(String message);    
    
    @Attribute(defaultValue = "130", dataType = Integer.class)
    String getServerOrdinality();
    public void setServerOrdinality(String message);

    @Attribute(defaultValue = "140", dataType = Integer.class)
    String getApplicationOrdinality();
    public void setApplicationOrdinality(String message);    

    @Attribute(defaultValue = "150", dataType = Integer.class)
    String getModuleOrdinality();
    public void setModuleOrdinality(String message);    

    @Attribute(defaultValue = "160", dataType = Integer.class)
    String getClusterOrdinality();
    public void setClusterOrdinality(String message);    
    
    @Attribute(defaultValue = "115", dataType = Integer.class)
    String getJNDIOrdinality();
    public void setJNDIOrdinality(String message);  
    
    @Attribute(defaultValue = "secrets", dataType = String.class)
    String getSecretDir();
    public void setSecretDir(String directory);
    
    @Attribute(defaultValue = "90", dataType = Integer.class)
    String getSecretDirOrdinality();
    public void setSecretDirOrdinality(String message);  
    
}
