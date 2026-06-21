package r5;

import com.google.android.gms.internal.ads.e7;
import com.google.android.gms.internal.measurement.h5;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.p;
import m3.z;
import n5.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f32229h = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e7 f32231c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap f32233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f32234f = -3.4028235E38f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f32235g = -3.4028235E38f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f32232d = new p();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.f32230b = false;
            this.f32231c = null;
            return;
        }
        this.f32230b = true;
        String strP = z.p((byte[]) list.get(0));
        h5.h(strP.startsWith("Format:"));
        e7 e7VarA = e7.a(strP);
        e7VarA.getClass();
        this.f32231c = e7VarA;
        b(new p((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j10));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long c(String str) {
        Matcher matcher = f32229h.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = z.f28608a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(m3.p r39, java.nio.charset.Charset r40) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.a.b(m3.p, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    @Override // n5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(byte[] r44, int r45, int r46, n5.l r47, m3.g r48) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.a.p(byte[], int, int, n5.l, m3.g):void");
    }

    @Override // n5.m
    public final int s() {
        return 1;
    }
}
