package se452.group9.seeker;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Company {

    @Min(value = 1, message = "company ID must be greater than 0")
    @Max(value = 99999999, message = "company ID can be at most 8 digits")
    private int companyID;

    @Size(min = 1, max = 50, message = "limit for company name is 50 chars.")
    private String companyName;

    @Size(max = 250, message = "limit for address is 250 chars.")
    private String address;

    private final ICompanyDesciber companyProfile;

    public Company(String companyName) {
        if (companyName == null) throw new IllegalArgumentException();

        this.companyName = companyName;
        this.companyProfile = new CompanyProfile(companyName);
    }

    public void updateInfo(String info) {
        companyProfile.editInfo(info);
    }

}
