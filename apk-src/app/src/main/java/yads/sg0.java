package yads;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f42932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f42937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f42938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f42939h;

    public sg0(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f42933b = str;
        this.f42934c = "".equals(str2) ? null : str2;
        this.f42935d = j10;
        this.f42936e = j11;
        this.f42937f = j12;
        this.f42938g = j13;
        this.f42939h = list;
    }

    public static List a(lr lrVar) {
        List list = lrVar.f40645h;
        if (list != null) {
            return list;
        }
        Map map = lrVar.f40644g;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new r01((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static sg0 a(tg0 tg0Var) throws IOException {
        if (ug0.a(tg0Var) == 538247942) {
            String str = new String(ug0.a(tg0Var, ug0.b(tg0Var)), "UTF-8");
            String str2 = new String(ug0.a(tg0Var, ug0.b(tg0Var)), "UTF-8");
            long jB = ug0.b(tg0Var);
            long jB2 = ug0.b(tg0Var);
            long jB3 = ug0.b(tg0Var);
            long jB4 = ug0.b(tg0Var);
            int iA = ug0.a(tg0Var);
            if (iA >= 0) {
                List arrayList = iA == 0 ? Collections.EMPTY_LIST : new ArrayList();
                int i = 0;
                while (i < iA) {
                    arrayList.add(new r01(new String(ug0.a(tg0Var, ug0.b(tg0Var)), "UTF-8").intern(), new String(ug0.a(tg0Var, ug0.b(tg0Var)), "UTF-8").intern()));
                    i++;
                    str = str;
                    str2 = str2;
                    jB = jB;
                }
                return new sg0(str, str2, jB, jB2, jB3, jB4, arrayList);
            }
            throw new IOException(og2.a("readHeaderList size=", iA));
        }
        throw new IOException();
    }

    public final lr a(byte[] bArr) {
        lr lrVar = new lr();
        lrVar.f40638a = bArr;
        lrVar.f40639b = this.f42934c;
        lrVar.f40640c = this.f42935d;
        lrVar.f40641d = this.f42936e;
        lrVar.f40642e = this.f42937f;
        lrVar.f40643f = this.f42938g;
        List<r01> list = this.f42939h;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (r01 r01Var : list) {
            treeMap.put(r01Var.f42435a, r01Var.f42436b);
        }
        lrVar.f40644g = treeMap;
        lrVar.f40645h = Collections.unmodifiableList(this.f42939h);
        return lrVar;
    }

    public final boolean a(BufferedOutputStream bufferedOutputStream) {
        try {
            ug0.a(bufferedOutputStream, 538247942);
            byte[] bytes = this.f42933b.getBytes("UTF-8");
            ug0.a(bufferedOutputStream, bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            String str = this.f42934c;
            if (str == null) {
                str = "";
            }
            byte[] bytes2 = str.getBytes("UTF-8");
            ug0.a(bufferedOutputStream, bytes2.length);
            bufferedOutputStream.write(bytes2, 0, bytes2.length);
            ug0.a(bufferedOutputStream, this.f42935d);
            ug0.a(bufferedOutputStream, this.f42936e);
            ug0.a(bufferedOutputStream, this.f42937f);
            ug0.a(bufferedOutputStream, this.f42938g);
            List<r01> list = this.f42939h;
            if (list != null) {
                ug0.a(bufferedOutputStream, list.size());
                for (r01 r01Var : list) {
                    byte[] bytes3 = r01Var.f42435a.getBytes("UTF-8");
                    ug0.a(bufferedOutputStream, bytes3.length);
                    bufferedOutputStream.write(bytes3, 0, bytes3.length);
                    byte[] bytes4 = r01Var.f42436b.getBytes("UTF-8");
                    ug0.a(bufferedOutputStream, bytes4.length);
                    bufferedOutputStream.write(bytes4, 0, bytes4.length);
                }
            } else {
                ug0.a(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException unused) {
            boolean z5 = om3.f41652a;
            return false;
        }
    }
}
