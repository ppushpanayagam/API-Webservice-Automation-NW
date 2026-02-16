1. Framework Tech stack
    1. Pre-requisites
        JDK Installed
        Maven installed
        IDE(IntelliJ, Eclipse) set up with Cucumber plugins.

    2. Clone and set up the framework
        Clone the repo: https://github.com/ppushpanayagam/API-Webservice-Automation-NW
        run: mvn clean install
        run: clean test -DENV=DEV -Dcucumber.filter.tags=@regression

2. Framework Configuration and Running the Tests
    1. Click on RUN / Debug dropdown button
    2. Edit Configuration button
    3. Click + to add Maven configuration (clean test -DENV=DEV -Dcucumber.filter.tags=@regression)
    4. Configure API tests locally for different environment
    5. Click Play button to run the tests on selected environment.

3. Test Report and Results
    Cucumber HTML report is configured with this framework and it can be accessed after running any tests. Also, test report can be accessed in:
        target/cucumber-reports/cucumber.html

4. TAGs: tagging enabled and test can be executed with the help of TAGs to segregate the scenarios.

5. ENV config: environment config enabled to run the tests on different environment.
