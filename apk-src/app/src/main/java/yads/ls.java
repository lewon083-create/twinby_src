package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40648a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f40649b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f40650c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f40651d = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ks f40652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ks f40653f;

    public ls(kn0 kn0Var, File file) {
        is isVar = new is(kn0Var);
        js jsVar = new js(new File(file, "monetization_cached_content_index.exi"));
        this.f40652e = isVar;
        this.f40653f = jsVar;
    }

    public final hs a(String str) {
        hs hsVar = (hs) this.f40648a.get(str);
        if (hsVar != null) {
            return hsVar;
        }
        SparseArray sparseArray = this.f40649b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        hs hsVar2 = new hs(iKeyAt, str, jc0.f39820c);
        this.f40648a.put(str, hsVar2);
        this.f40649b.put(iKeyAt, str);
        this.f40651d.put(iKeyAt, true);
        this.f40652e.a(hsVar2);
        return hsVar2;
    }

    public final void b(String str) {
        hs hsVar = (hs) this.f40648a.get(str);
        if (hsVar != null && hsVar.f39299c.isEmpty() && hsVar.f39300d.isEmpty()) {
            this.f40648a.remove(str);
            int i = hsVar.f39297a;
            boolean z5 = this.f40651d.get(i);
            this.f40652e.a(hsVar, z5);
            if (z5) {
                this.f40649b.remove(i);
                this.f40651d.delete(i);
            } else {
                this.f40649b.put(i, null);
                this.f40650c.put(i, true);
            }
        }
    }

    public final void a(long j10) {
        ks ksVar;
        this.f40652e.a(j10);
        ks ksVar2 = this.f40653f;
        if (ksVar2 != null) {
            ksVar2.a(j10);
        }
        if (!this.f40652e.a() && (ksVar = this.f40653f) != null && ksVar.a()) {
            this.f40653f.a(this.f40648a, this.f40649b);
            this.f40652e.b(this.f40648a);
        } else {
            this.f40652e.a(this.f40648a, this.f40649b);
        }
        ks ksVar3 = this.f40653f;
        if (ksVar3 != null) {
            ksVar3.b();
            this.f40653f = null;
        }
    }

    public static jc0 a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < i; i10++) {
            String utf = dataInputStream.readUTF();
            int i11 = dataInputStream.readInt();
            if (i11 >= 0) {
                int iMin = Math.min(i11, 10485760);
                byte[] bArrCopyOf = lb3.f40471f;
                int i12 = 0;
                while (i12 != i11) {
                    int i13 = i12 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i13);
                    dataInputStream.readFully(bArrCopyOf, i12, iMin);
                    iMin = Math.min(i11 - i13, 10485760);
                    i12 = i13;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(og2.a("Invalid value size: ", i11));
            }
        }
        return new jc0(map);
    }

    public final void a() {
        this.f40652e.a(this.f40648a);
        int size = this.f40650c.size();
        for (int i = 0; i < size; i++) {
            this.f40649b.remove(this.f40650c.keyAt(i));
        }
        this.f40650c.clear();
        this.f40651d.clear();
    }
}
