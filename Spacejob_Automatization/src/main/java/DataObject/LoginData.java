package DataObject;

import com.github.javafaker.Faker;

public interface LoginData {

    Faker faker = new Faker();

    String

            validUsername = faker.bothify("?????_user"),
            validUsername_1 = faker.bothify("?????_user"),
            validUsername_2 = faker.bothify("?????_user"),
            valid_id = faker.bothify("###########"),
            valid_id_1 = faker.bothify("###########"),
            valid_id_2 = faker.bothify("###########"),
             valid_username = faker.bothify("????"),
            valid_username_1 = faker.bothify("?_????"),
            valid_username_2 = faker.bothify("???????"),
            valid_useSurname = faker.bothify("usr_??????"),
            valid_useSurname_1 = faker.bothify("usr_????"),
            valid_useSurname_2 = faker.bothify("usr_???"),
            valid_mob_num = faker.bothify("599######"),
            valid_mob_num_1 = faker.bothify("599######"),
            valid_mob_num_2 = faker.bothify("599######"),

            valid_email = faker.bothify("???###@gmail.com"),
            valid_email_1 = faker.bothify("???###@gmail.com"),
            valid_email_2 = faker.bothify("???###@gmail.com"),
            validPassword = "Password123";
}
