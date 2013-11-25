/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.wikistream.instance.input;

import org.xwiki.properties.annotation.PropertyDescription;
import org.xwiki.properties.annotation.PropertyName;

/**
 * @version $Id$
 * @since 5.3RC1
 */
public class DocumentInstanceInputProperties extends InstanceInputProperties
{
    /**
     * @see #isWithRevisions()
     */
    private boolean withRevisions = true;

    /**
     * @see #isWithWikiAttachments()
     */
    private boolean withWikiAttachments = true;

    /**
     * @see #isWithWikiObjects()
     */
    private boolean withWikiObjects = true;

    /**
     * @see #isWithWikiClass()
     */
    private boolean withWikiClass = true;

    /**
     * @see #isWithWikiDocumentContentHTML()
     */
    private boolean withWikiDocumentContentHTML;

    /**
     * @return Indicate if events should be generated for history
     */
    @PropertyName("With revisions")
    @PropertyDescription("Indicate if events should be generated for history")
    public boolean isWithRevisions()
    {
        return this.withRevisions;
    }

    /**
     * @param withRevisions Indicate if events should be generated for history
     */
    public void setWithRevisions(boolean withRevisions)
    {
        this.withRevisions = withRevisions;
    }

    /**
     * @return Indicate if events should be generated for attachments
     */
    @PropertyName("With attachments")
    @PropertyDescription("Indicate if events should be generated for attachments")
    public boolean isWithWikiAttachments()
    {
        return this.withWikiAttachments;
    }

    /**
     * @param withWikiAttachments Indicate if events should be generated for attachments
     */
    public void setWithWikiAttachments(boolean withWikiAttachments)
    {
        this.withWikiAttachments = withWikiAttachments;
    }

    /**
     * @return Indicate if events should be generated for classes
     */
    @PropertyName("With classes")
    @PropertyDescription("Indicate if events should be generated for classes")
    public boolean isWithWikiClass()
    {
        return this.withWikiClass;
    }

    /**
     * @param withWikiClass Indicate if events should be generated for classes
     */
    public void setWithWikiClass(boolean withWikiClass)
    {
        this.withWikiClass = withWikiClass;
    }

    /**
     * @return Indicate if events should be generated for objects
     */
    @PropertyName("With objects")
    @PropertyDescription("Indicate if events should be generated for objects")
    public boolean isWithWikiObjects()
    {
        return this.withWikiObjects;
    }

    /**
     * @param withWikiObjects Indicate if events should be generated for objects
     */
    public void setWithWikiObjects(boolean withWikiObjects)
    {
        this.withWikiObjects = withWikiObjects;
    }

    /**
     * @return Indicate if events should be generated for document content as HTML
     */
    @PropertyName("With content as HTML")
    @PropertyDescription("Indicate if events should be generated for document content as HTML")
    public boolean isWithWikiDocumentContentHTML()
    {
        return this.withWikiDocumentContentHTML;
    }

    /**
     * @param withWikiDocumentContentHTML Indicate if events should be generated for document content as HTML
     */
    public void setWithWikiDocumentContentHTML(boolean withWikiDocumentContentHTML)
    {
        this.withWikiDocumentContentHTML = withWikiDocumentContentHTML;
    }
}
