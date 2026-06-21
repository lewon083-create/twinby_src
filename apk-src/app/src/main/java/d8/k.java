package d8;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class k implements q6.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f15638d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15640c;

    public /* synthetic */ k(int i) {
        this.f15639b = i;
    }

    public static CharSequence e(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // q6.c
    public String b() {
        return this.f15640c;
    }

    public void c(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(e(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f15640c);
                    sb2.append(e(it.next()));
                }
            }
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public String d(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        c(sb2, it);
        return sb2.toString();
    }

    public String toString() {
        switch (this.f15639b) {
            case 1:
                return a0.u.n(new StringBuilder("<"), this.f15640c, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k(String str, int i) {
        this.f15639b = i;
        this.f15640c = str;
    }

    public k(String str) {
        this.f15639b = 4;
        str.getClass();
        this.f15640c = str;
    }

    @Override // q6.c
    public void a(r6.b bVar) {
    }
}
