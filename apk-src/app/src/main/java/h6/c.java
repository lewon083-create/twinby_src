package h6;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20439b;

    public c(List topics, List encryptedTopics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(encryptedTopics, "encryptedTopics");
        this.f20438a = topics;
        this.f20439b = encryptedTopics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        List list = this.f20438a;
        int size = list.size();
        c cVar = (c) obj;
        List list2 = cVar.f20439b;
        List list3 = cVar.f20438a;
        if (size == list3.size()) {
            List list4 = this.f20439b;
            if (list4.size() == list2.size() && new HashSet(list).equals(new HashSet(list3)) && new HashSet(list4).equals(new HashSet(list2))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20438a, this.f20439b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.f20438a + ", EncryptedTopics=" + this.f20439b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(List topics) {
        this(topics, b0.f27475b);
        Intrinsics.checkNotNullParameter(topics, "topics");
    }
}
