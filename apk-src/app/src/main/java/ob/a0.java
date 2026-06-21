package ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.CamcorderProfile;
import com.google.android.gms.internal.measurement.a8;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.h9;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.l7;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.y8;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements w, oe.k, pa.l, p2.c, q4.m, t.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a0 f29911c = new a0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a0 f29912d = new a0(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a0 f29913e = new a0(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a0 f29914f = new a0(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a0 f29915g = new a0(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a0 f29916h = new a0(5);
    public static final /* synthetic */ a0 i = new a0(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a0 f29917j = new a0(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a0 f29918k = new a0(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a0 f29919l = new a0(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a0 f29920m = new a0(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a0 f29921n = new a0(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a0 f29922o = new a0(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a0 f29923p = new a0(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ a0 f29924q = new a0(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a0 f29925r = new a0(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a0 f29926s = new a0(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a0 f29927t = new a0(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a0 f29928u = new a0(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a0 f29929v = new a0(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29930b;

    public /* synthetic */ a0(int i10) {
        this.f29930b = i10;
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static r3.b f(Context context, String[] strArr, String str, com.google.firebase.messaging.y yVar) {
        String[] strArrI = i(context);
        int length = strArrI.length;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str2 = strArrI[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i11 = i12;
                }
            }
            if (zipFile != null) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i13 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder("lib");
                            char c8 = File.separatorChar;
                            sb2.append(c8);
                            sb2.append(str3);
                            sb2.append(c8);
                            sb2.append(str);
                            String string = sb2.toString();
                            yVar.r("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                r3.b bVar = new r3.b(3, false);
                                bVar.f32188c = zipFile;
                                bVar.f32189d = entry;
                                return bVar;
                            }
                        }
                        i13 = i14;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
        }
    }

    public static String[] g(Context context, String str) {
        StringBuilder sb2 = new StringBuilder("lib");
        char c8 = File.separatorChar;
        sb2.append(c8);
        sb2.append("([^\\");
        sb2.append(c8);
        sb2.append("]*)");
        sb2.append(c8);
        sb2.append(str);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : i(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] i(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // q4.m
    public q4.a0 P(int i10, int i11) {
        return new q4.j();
    }

    @Override // t.f
    public CamcorderProfile a(int i10, int i11) {
        return CamcorderProfile.get(i10, i11);
    }

    @Override // t.f
    public boolean b(int i10, int i11) {
        return CamcorderProfile.hasProfile(i10, i11);
    }

    @Override // pa.l
    public /* bridge */ /* synthetic */ Object c(na.l lVar) {
        return null;
    }

    @Override // ob.w
    public Object h() {
        switch (this.f29930b) {
            case 0:
                List list = d0.f29996a;
                q8.f13932c.get();
                Long l10 = (Long) s8.f13962b.b();
                l10.getClass();
                return l10;
            case 1:
                List list2 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13819s.b()).longValue());
            case 2:
                List list3 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13792d.b()).longValue());
            case 3:
                List list4 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13803j0.b()).longValue());
            case 4:
                List list5 = d0.f29996a;
                g7.f13765c.get();
                return (String) i7.f13791c0.b();
            case 5:
                List list6 = d0.f29996a;
                g7.f13765c.get();
                Long l11 = (Long) i7.f13802j.b();
                l11.getClass();
                return l11;
            case 6:
                List list7 = d0.f29996a;
                g7.f13765c.get();
                return (String) i7.f13804k.b();
            case 7:
                List list8 = d0.f29996a;
                g7.f13765c.get();
                Long l12 = (Long) i7.Z.b();
                l12.getClass();
                return l12;
            case 8:
                List list9 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13827w.b()).longValue());
            case 9:
                List list10 = d0.f29996a;
                g7.f13765c.get();
                Boolean bool = (Boolean) i7.C.b();
                bool.getClass();
                return bool;
            case 10:
                List list11 = d0.f29996a;
                Boolean bool2 = (Boolean) a8.f13661a.b();
                bool2.getClass();
                return bool2;
            case 11:
                List list12 = d0.f29996a;
                Boolean bool3 = (Boolean) p8.f13923a.b();
                bool3.getClass();
                return bool3;
            case 12:
                List list13 = d0.f29996a;
                return Integer.valueOf((int) ((Long) l7.f13871a.b()).longValue());
            case 13:
                List list14 = d0.f29996a;
                Boolean bool4 = (Boolean) h9.f13776a.b();
                bool4.getClass();
                return bool4;
            case 14:
                List list15 = d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13809m0.b()).longValue());
            case 15:
                List list16 = d0.f29996a;
                t8.f13974c.get();
                Boolean bool5 = (Boolean) v8.f14031g.b();
                bool5.getClass();
                return bool5;
            case 16:
                List list17 = d0.f29996a;
                Boolean bool6 = (Boolean) r7.f13947b.b();
                bool6.getClass();
                return bool6;
            case 17:
                List list18 = d0.f29996a;
                t8.f13974c.get();
                Boolean bool7 = (Boolean) v8.f14028d.b();
                bool7.getClass();
                return bool7;
            case 18:
                List list19 = d0.f29996a;
                g7.f13765c.get();
                Long l13 = (Long) i7.f13786a.b();
                l13.getClass();
                return l13;
            default:
                return new Boolean(((Boolean) y8.f14107a.b()).booleanValue());
        }
    }

    @Override // oe.k
    public Object l() {
        switch (this.f29930b) {
            case 20:
                return new TreeMap();
            case 21:
                return new TreeSet();
            default:
                return new ArrayList();
        }
    }

    @Override // q4.m
    public void G() {
    }

    @Override // p2.c
    public Object d(p2.b bVar) throws p2.b {
        throw bVar;
    }

    @Override // q4.m
    public void j(q4.t tVar) {
    }
}
