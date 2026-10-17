# QA Automation Practice

Practice repository for browser test automation using Playwright and pytest.

## Tech stack
- Python 3.13
- Playwright 1.64
- pytest 9

## Project structure
python-playwright/
├── tests/           test files, one per topic
├── pytest.ini       pytest settings
└── requirements.txt dependencies

## Setup
1. python -m venv venv
2. venv\Scripts\activate
3. pip install -r requirements.txt
4. playwright install

## Run tests
- All tests: pytest --headed
- One file: pytest tests\test_01_open_page.py --headed

## Topics covered
- [x] 01 Open a page
- [ ] 02 Locators
- [ ] 03 Actions
- [ ] 04 Assertions
- [ ] 05 Waits
- [ ] 06 Login flow
