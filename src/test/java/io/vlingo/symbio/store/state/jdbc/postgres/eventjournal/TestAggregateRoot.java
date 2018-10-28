package io.vlingo.symbio.store.state.jdbc.postgres.eventjournal;

import java.util.Objects;

public class TestAggregateRoot {
    public final String id;
    public final int number;

    public TestAggregateRoot(String id, int number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestAggregateRoot that = (TestAggregateRoot) o;
        return number == that.number &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }

    @Override
    public String toString() {
        return "TestAggregateRoot{" +
                "id='" + id + '\'' +
                ", number=" + number +
                '}';
    }
}
