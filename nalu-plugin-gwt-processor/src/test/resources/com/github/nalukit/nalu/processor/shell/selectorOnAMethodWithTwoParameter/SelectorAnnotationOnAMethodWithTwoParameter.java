package com.github.nalukit.nalu.processor.shell.selectorOnAMethodWithTwoParameter;

import com.github.nalukit.nalu.client.component.AbstractShell;
import com.github.nalukit.nalu.client.component.annotation.Shell;
import com.github.nalukit.nalu.plugin.gwt.client.annotation.Selector;
import com.github.nalukit.nalu.plugin.gwt.client.selector.IsSelectorProvider;
import com.github.nalukit.nalu.processor.common.MockContext;
import com.google.gwt.user.client.ui.Widget;

/**
 * this is the presenter of the shell. The shell divides the browser in
 * severeal areas.
 */
@Shell("shellName")
public class SelectorAnnotationOnAMethodWithTwoParameter
    extends AbstractShell<MockContext> {

    public SelectorAnnotationOnAMethodWithTwoParameter() {
        super();
    }

    /**
     * The ShellPresenter has to implemented this method, because the framework
     * can not do this. (It does not know, what to use).
     * <p>
     * We append the shell to the browser body.
     */
    @Override
    public void attachShell() {
    }

    @Selector("selector01")
    public void setContent(Widget widget01, Widget widget02) {
    }

}
