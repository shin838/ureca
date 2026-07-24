public interface MemberDao {
    void insert(Member member);
    Member findById(String id);
}