from playwright.sync_api import Page

def test_open_example(page: Page):
    page.goto("https://example.com")
    assert page.title() == "Example Domain"