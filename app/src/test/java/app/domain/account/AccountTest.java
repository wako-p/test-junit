package app.domain.account;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Nested
    class CreateTest {

        @Test
        void 引数にIDとメールアドレスを指定して生成できる() {
            // when:
            var account = Account.create("test1", "test1@gmail.com");

            // then:
            assertEquals("test1", account.id);
            assertEquals("test1@gmail.com", account.email);
        }

    }

    @Nested
    class ReconstructTest {

        @Test
        void 引数にIDとメールアドレスを指定して生成できる() {
            // when:
            var account = Account.reconstruct("test1", "test1@gmail.com");

            // then:
            assertEquals("test1", account.id);
            assertEquals("test1@gmail.com", account.email);
        }

    }
}
