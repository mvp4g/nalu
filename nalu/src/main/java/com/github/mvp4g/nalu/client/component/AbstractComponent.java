package com.github.mvp4g.nalu.client.component;

public abstract class AbstractComponent<C extends IsComponent.Controller, W>
    implements IsComponent<C, W> {

  private C controller;

  private W element;

  public AbstractComponent() {
    this.element = render();
  }

  @Override
  public W asElement() {
    assert element != null : "not alement set!";
    return this.element;
  }

  @Override
  public void attach() {
    // if you need to do something in case the widget is added to the DOM tree
  }

  @Override
  public void detach() {
    // if you need to do something in case the widget is removed from the DOM tree
  }

  @Override
  public C getController() {
    return this.controller;
  }

  @Override
  public void setController(C controller) {
    this.controller = controller;
  }

  protected abstract W render();
}