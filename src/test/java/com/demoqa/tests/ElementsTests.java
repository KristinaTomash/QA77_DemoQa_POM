package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.elements.BrokenLinksImagesPages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElementsTests extends TestBase {
    SidePanel sidePanel;
    BrokenLinksImagesPages broken;

    @BeforeEach
    public void precondition(){
        sidePanel = new SidePanel(driver);
        new HomePage(driver).getElements();
        broken = new BrokenLinksImagesPages(driver);
    }
    @Test
    public void getAllLinksTest(){
        sidePanel.getBrokenLinksImages();
        broken.getAllLinks();

    }
    @Test
    public void checkBrokenLinksTest(){
        sidePanel.getBrokenLinksImages();
        broken.checkBrokenLinks();
    }
    @Test
    public void checkBrokenImagesTest(){
        sidePanel.getBrokenLinksImages();
        broken.checkBrokenImages();
    }
}
