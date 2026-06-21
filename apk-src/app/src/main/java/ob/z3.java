package ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.oq;
import com.google.android.gms.internal.ads.ur;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.t8;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.App;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 implements t1 {
    public static volatile z3 L;
    public ArrayList A;
    public final HashMap C;
    public final HashMap D;
    public final HashMap E;
    public r2 G;
    public String H;
    public j3 I;
    public long J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f30605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f30606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f30607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d8.o0 f30608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p3 f30609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f30610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v0 f30611h;
    public v0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f3 f30612j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b1 f30614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l1 f30615m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30617o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f30618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f30619q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f30621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f30622t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f30623u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f30624v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f30625w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FileLock f30626x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FileChannel f30627y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f30628z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f30616n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedList f30620r = new LinkedList();
    public final HashMap F = new HashMap();
    public final m4.d K = new m4.d(this);
    public long B = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w3 f30613k = new w3(this);

    public z3(a4.b bVar) {
        this.f30615m = l1.r(bVar.f422b, null, null);
        v0 v0Var = new v0(this, 2);
        v0Var.E();
        this.f30611h = v0Var;
        v0 v0Var2 = new v0(this, 0);
        v0Var2.E();
        this.f30606c = v0Var2;
        e1 e1Var = new e1(this);
        e1Var.E();
        this.f30605b = e1Var;
        this.C = new HashMap();
        this.D = new HashMap();
        this.E = new HashMap();
        e().L(new ac.g(29, this, bVar));
    }

    public static z3 C(Context context) {
        pa.c0.i(context);
        pa.c0.i(context.getApplicationContext());
        if (L == null) {
            synchronized (z3.class) {
                try {
                    if (L == null) {
                        L = new z3(new a4.b(context, 3));
                    }
                } finally {
                }
            }
        }
        return L;
    }

    public static final void D(com.google.android.gms.internal.measurement.c3 c3Var, int i, String str) {
        List listH = c3Var.h();
        for (int i10 = 0; i10 < listH.size(); i10++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.g3) listH.get(i10)).q())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.f3 f3VarB = com.google.android.gms.internal.measurement.g3.B();
        f3VarB.h("_err");
        f3VarB.j(i);
        com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) f3VarB.e();
        com.google.android.gms.internal.measurement.f3 f3VarB2 = com.google.android.gms.internal.measurement.g3.B();
        f3VarB2.h("_ev");
        f3VarB2.i(str);
        com.google.android.gms.internal.measurement.g3 g3Var2 = (com.google.android.gms.internal.measurement.g3) f3VarB2.e();
        c3Var.k(g3Var);
        c3Var.k(g3Var2);
    }

    public static final void E(com.google.android.gms.internal.measurement.c3 c3Var, String str) {
        List listH = c3Var.h();
        for (int i = 0; i < listH.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.g3) listH.get(i)).q())) {
                c3Var.m(i);
                return;
            }
        }
    }

    public static String M(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final boolean S(g4 g4Var) {
        return !TextUtils.isEmpty(g4Var.f30132c);
    }

    public static final void T(u3 u3Var) {
        if (u3Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!u3Var.f30453d) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(u3Var.getClass())));
        }
    }

    public static final Boolean U(g4 g4Var) {
        Boolean bool = g4Var.f30145q;
        String str = g4Var.D;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((u1) k6.t0.v(str).f27180c).ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void B() {
        e().C();
        k0();
        if (this.f30617o) {
            return;
        }
        this.f30617o = true;
        e().C();
        FileLock fileLock = this.f30626x;
        l1 l1Var = this.f30615m;
        if (fileLock == null || !fileLock.isValid()) {
            ((l1) this.f30607d.f15951b).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(l1Var.f30260b.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.f30627y = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.f30626x = fileLockTryLock;
                if (fileLockTryLock == null) {
                    b().f30411g.f("Storage concurrent data access panic");
                    return;
                }
                b().f30418o.f("Storage concurrent access okay");
            } catch (FileNotFoundException e3) {
                b().f30411g.g(e3, "Failed to acquire storage lock");
                return;
            } catch (IOException e7) {
                b().f30411g.g(e7, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e10) {
                b().f30413j.g(e10, "Storage lock already acquired");
                return;
            }
        } else {
            b().f30418o.f("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.f30627y;
        e().C();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            b().f30411g.f("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i10 = fileChannel.read(byteBufferAllocate);
                if (i10 == 4) {
                    byteBufferAllocate.flip();
                    i = byteBufferAllocate.getInt();
                } else if (i10 != -1) {
                    b().f30413j.g(Integer.valueOf(i10), "Unexpected data length. Bytes read");
                }
            } catch (IOException e11) {
                b().f30411g.g(e11, "Failed to read from channel");
            }
        }
        l0 l0VarQ = l1Var.q();
        l0VarQ.D();
        int i11 = l0VarQ.f30248f;
        e().C();
        if (i > i11) {
            b().f30411g.h(Integer.valueOf(i), "Panic: can't downgrade version. Previous, current version", Integer.valueOf(i11));
            return;
        }
        if (i < i11) {
            FileChannel fileChannel2 = this.f30627y;
            e().C();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                b().f30411g.f("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i11);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        b().f30411g.g(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    b().f30418o.h(Integer.valueOf(i), "Storage version upgraded. Previous, current version", Integer.valueOf(i11));
                    return;
                } catch (IOException e12) {
                    b().f30411g.g(e12, "Failed to write to channel");
                }
            }
            b().f30411g.h(Integer.valueOf(i), "Storage version upgrade failed. Previous, current version", Integer.valueOf(i11));
        }
    }

    public final int F(String str, ni.i iVar) {
        u1 u1VarG;
        e1 e1Var = this.f30605b;
        com.google.android.gms.internal.measurement.c2 c2VarX = e1Var.X(str);
        w1 w1Var = w1.AD_PERSONALIZATION;
        if (c2VarX == null) {
            iVar.G(w1Var, h.FAILSAFE);
            return 1;
        }
        n nVar = this.f30607d;
        T(nVar);
        w0 w0VarE0 = nVar.E0(str);
        if (w0VarE0 == null || ((u1) k6.t0.v(w0VarE0.s()).f27180c) != u1.POLICY || (u1VarG = e1Var.G(str, w1Var)) == u1.UNINITIALIZED) {
            iVar.G(w1Var, h.REMOTE_DEFAULT);
            if (e1Var.W(str, w1Var)) {
                return 0;
            }
        } else {
            iVar.G(w1Var, h.REMOTE_ENFORCED_DEFAULT);
            if (u1VarG == u1.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(com.google.android.gms.internal.measurement.d3 d3Var) {
        Serializable serializableR;
        HashMap map = new HashMap();
        i0();
        HashMap map2 = new HashMap();
        for (com.google.android.gms.internal.measurement.g3 g3Var : d3Var.p()) {
            if (g3Var.q().startsWith("gad_") && (serializableR = v0.R(g3Var)) != null) {
                map2.put(g3Var.q(), serializableR);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final void H() {
        e().C();
        if (this.f30620r.isEmpty()) {
            return;
        }
        if (this.I == null) {
            this.I = new j3(this, this.f30615m, 2);
        }
        if (this.I.f30318c != 0) {
            return;
        }
        o().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) d0.B0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.J));
        b().f30418o.g(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.I == null) {
            this.I = new j3(this, this.f30615m, 2);
        }
        this.I.b(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(3:9|10|(4:12|13|(4:15|(1:22)|25|472)(18:26|27|(2:35|(3:37|(1:44)(1:43)|45)(0))(1:34)|46|(2:48|(3:50|(4:53|(1:477)(2:59|474)|60|51)|473))|61|62|(4:64|65|(0)(1:71)|(7:117|(5:121|(2:123|488)(2:124|(2:126|487)(1:489))|127|118|119)|486|128|(2:131|(3:137|(1:139)(2:140|(3:142|(3:145|(1:147)(1:505)|143)|504))|148)(2:135|136))(1:130)|149|(2:151|(6:(2:156|(6:158|159|193|(9:195|(4:198|(2:211|(2:213|491)(1:493))(5:202|(5:205|(2:208|206)|495|209|203)|494|210|492)|214|196)|490|215|(4:218|(3:497|220|500)(1:499)|498|216)|496|221|(2:224|222)|501)(1:225)|226|471))|160|193|(0)(0)|226|471)(7:161|162|192|193|(0)(0)|226|471))(2:163|(8:165|(6:(2:170|(6:172|159|193|(0)(0)|226|471))|173|193|(0)(0)|226|471)|162|192|193|(0)(0)|226|471)(7:174|(2:185|(2:186|(2:188|(2:503|190)(1:191))(1:502)))(0)|192|193|(0)(0)|226|471)))(3:136|149|(0)(0)))(1:72)|70|(3:73|74|(3:76|(2:78|480)(2:79|(2:81|481)(2:82|479))|83)(1:478))|84|(1:87)|(1:89)|90|(1:92)(1:93)|94|(4:99|(4:102|(2:104|484)(2:105|(2:107|483)(1:485))|108|100)|482|(1:(1:114)(1:115))(1:(1:111)(2:112|(0)(0))))|(0)(0))|227)(1:470))|228|(3:230|(2:232|(2:234|508)(2:235|(1:509)(3:237|(1:239)(1:240)|(1:511)(2:244|507))))(0)|245)|506|246|(3:247|248|(1:512)(2:250|(2:513|252)(1:514)))|253|(1:255)(2:256|(1:258))|259|(1:261)(1:262)|263|(1:265)(1:266)|267|(6:270|(1:272)|273|(2:275|516)(1:517)|276|268)|515|277|(2:282|(1:286))(1:281)|287|(1:289)|290|(1:292)|293|(2:295|(1:301))|302|(8:304|(8:308|309|(4:311|(2:313|(1:315))|(1:332)(5:319|(1:323)|325|(1:330)(1:329)|331)|333)(3:335|(4:466|337|342|(6:344|(3:347|(3:522|349|(3:351|355|(1:357)(6:358|(1:362)|363|(1:365)(1:367)|366|(3:369|(1:377)|378)(4:379|(3:381|(1:383)|384)(4:385|(1:387)(1:388)|389|(3:391|(1:393)|394)(2:395|(1:397)))|398|519)))(2:352|(0)(0)))(1:353)|345)|521|354|355|(0)(0))(3:354|355|(0)(0)))(3:341|342|(0)(0))|399)|334|520|399|305|306)|518|400|(1:402)|403|(2:406|404)|523)(1:407)|408|(1:410)(13:412|(9:414|(1:416)(1:417)|418|(1:420)(1:421)|422|(1:424)(1:425)|426|(1:428)(1:429)|430)|431|(3:433|(2:439|(1:441)(1:442))(1:438)|443)|444|(3:(2:448|525)(1:526)|449|445)|524|450|(1:452)|453|468|454|458)|411|431|(0)|444|(1:445)|524|450|(0)|453|468|454|458) */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0f21, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0f22, code lost:
    
        ((ob.l1) r2.f15951b).b().G().h(ob.s0.K(r1), "Failed to remove unused event metadata. appId", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x074f A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b19 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0b4d A[PHI: r2
      0x0b4d: PHI (r2v54 long) = (r2v53 long), (r2v77 long) binds: [B:343:0x0b17, B:521:0x0b4d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0b65 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0b88 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0e34 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0ec1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0ef2 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(long r47, java.lang.String r49) {
        /*
            Method dump skipped, instruction units count: 3928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.I(long, java.lang.String):boolean");
    }

    public final void J(com.google.android.gms.internal.measurement.k3 k3Var, long j10, boolean z5) {
        c4 c4Var;
        Object obj;
        String str = true != z5 ? "_lte" : "_se";
        n nVar = this.f30607d;
        T(nVar);
        c4 c4VarW0 = nVar.w0(k3Var.o(), str);
        if (c4VarW0 == null || (obj = c4VarW0.f29992e) == null) {
            String strO = k3Var.o();
            o().getClass();
            c4Var = new c4(strO, "auto", str, System.currentTimeMillis(), Long.valueOf(j10));
        } else {
            String strO2 = k3Var.o();
            o().getClass();
            c4Var = new c4(strO2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j10));
        }
        com.google.android.gms.internal.measurement.t3 t3VarA = com.google.android.gms.internal.measurement.u3.A();
        t3VarA.b();
        ((com.google.android.gms.internal.measurement.u3) t3VarA.f13840c).C(str);
        o().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        t3VarA.b();
        ((com.google.android.gms.internal.measurement.u3) t3VarA.f13840c).B(jCurrentTimeMillis);
        Object obj2 = c4Var.f29992e;
        long jLongValue = ((Long) obj2).longValue();
        t3VarA.b();
        ((com.google.android.gms.internal.measurement.u3) t3VarA.f13840c).F(jLongValue);
        com.google.android.gms.internal.measurement.u3 u3Var = (com.google.android.gms.internal.measurement.u3) t3VarA.e();
        int iQ0 = v0.q0(k3Var, str);
        if (iQ0 >= 0) {
            k3Var.b();
            ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).c0(iQ0, u3Var);
        } else {
            k3Var.b();
            ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).d0(u3Var);
        }
        if (j10 > 0) {
            n nVar2 = this.f30607d;
            T(nVar2);
            nVar2.v0(c4Var);
            b().f30418o.h(true != z5 ? "lifetime" : "session-scoped", "Updated engagement user property. scope, value", obj2);
        }
    }

    public final boolean K(com.google.android.gms.internal.measurement.c3 c3Var, com.google.android.gms.internal.measurement.c3 c3Var2) {
        pa.c0.b("_e".equals(c3Var.n()));
        i0();
        com.google.android.gms.internal.measurement.g3 g3VarK = v0.K((com.google.android.gms.internal.measurement.d3) c3Var.e(), "_sc");
        String strS = g3VarK == null ? null : g3VarK.s();
        i0();
        com.google.android.gms.internal.measurement.g3 g3VarK2 = v0.K((com.google.android.gms.internal.measurement.d3) c3Var2.e(), "_pc");
        String strS2 = g3VarK2 != null ? g3VarK2.s() : null;
        if (strS2 == null || !strS2.equals(strS)) {
            return false;
        }
        pa.c0.b("_e".equals(c3Var.n()));
        i0();
        com.google.android.gms.internal.measurement.g3 g3VarK3 = v0.K((com.google.android.gms.internal.measurement.d3) c3Var.e(), "_et");
        if (g3VarK3 == null || !g3VarK3.t() || g3VarK3.u() <= 0) {
            return true;
        }
        long jU = g3VarK3.u();
        i0();
        com.google.android.gms.internal.measurement.g3 g3VarK4 = v0.K((com.google.android.gms.internal.measurement.d3) c3Var2.e(), "_et");
        if (g3VarK4 != null && g3VarK4.u() > 0) {
            jU += g3VarK4.u();
        }
        i0();
        v0.I(c3Var2, "_et", Long.valueOf(jU));
        i0();
        v0.I(c3Var, "_fr", 1L);
        return true;
    }

    public final boolean L() {
        e().C();
        k0();
        n nVar = this.f30607d;
        T(nVar);
        if (nVar.m0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        n nVar2 = this.f30607d;
        T(nVar2);
        return !TextUtils.isEmpty(nVar2.K());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instruction units count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.N():void");
    }

    public final void O() {
        e().C();
        if (this.f30623u || this.f30624v || this.f30625w) {
            b().f30418o.i("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f30623u), Boolean.valueOf(this.f30624v), Boolean.valueOf(this.f30625w));
            return;
        }
        b().f30418o.f("Stopping uploading service(s)");
        ArrayList arrayList = this.f30619q;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.f30619q;
        pa.c0.i(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(w0 w0Var) {
        try {
            long jP = w0Var.P();
            l1 l1Var = this.f30615m;
            if (jP != -2147483648L) {
                if (w0Var.P() == wa.b.a(l1Var.f30260b).d(0, w0Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = wa.b.a(l1Var.f30260b).d(0, w0Var.D()).versionName;
                String strN = w0Var.N();
                if (strN != null && strN.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final g4 Q(String str) {
        n nVar = this.f30607d;
        T(nVar);
        w0 w0VarE0 = nVar.E0(str);
        if (w0VarE0 != null) {
            l1 l1Var = w0VarE0.f30468a;
            if (!TextUtils.isEmpty(w0VarE0.N())) {
                Boolean boolP = P(w0VarE0);
                if (boolP != null && !boolP.booleanValue()) {
                    b().f30411g.g(s0.K(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strG = w0VarE0.G();
                String strN = w0VarE0.N();
                long jP = w0VarE0.P();
                i1 i1Var = l1Var.f30266h;
                l1.k(i1Var);
                i1Var.C();
                String str2 = w0VarE0.f30478l;
                i1 i1Var2 = l1Var.f30266h;
                l1.k(i1Var2);
                i1Var2.C();
                long j10 = w0VarE0.f30479m;
                i1 i1Var3 = l1Var.f30266h;
                l1.k(i1Var3);
                i1Var3.C();
                long j11 = w0VarE0.f30480n;
                i1 i1Var4 = l1Var.f30266h;
                l1.k(i1Var4);
                i1Var4.C();
                boolean z5 = w0VarE0.f30481o;
                String strJ = w0VarE0.J();
                i1 i1Var5 = l1Var.f30266h;
                l1.k(i1Var5);
                i1Var5.C();
                boolean z10 = w0VarE0.f30482p;
                Boolean boolW = w0VarE0.w();
                long jB = w0VarE0.b();
                i1 i1Var6 = l1Var.f30266h;
                l1.k(i1Var6);
                i1Var6.C();
                ArrayList arrayList = w0VarE0.f30485s;
                String strG2 = a(str).g();
                boolean zY = w0VarE0.y();
                i1 i1Var7 = l1Var.f30266h;
                l1.k(i1Var7);
                i1Var7.C();
                long j12 = w0VarE0.f30488v;
                int i = a(str).f30511b;
                String str3 = n0(str).f30335b;
                i1 i1Var8 = l1Var.f30266h;
                l1.k(i1Var8);
                i1Var8.C();
                int i10 = w0VarE0.f30490x;
                i1 i1Var9 = l1Var.f30266h;
                l1.k(i1Var9);
                i1Var9.C();
                return new g4(str, strG, strN, jP, str2, j10, j11, (String) null, z5, false, strJ, 0L, 0, z10, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j12, i, str3, i10, w0VarE0.B, w0VarE0.C(), w0VarE0.s(), 0L, w0VarE0.t());
            }
        }
        b().f30417n.g(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        n nVar = this.f30607d;
        T(nVar);
        s sVarA0 = nVar.a0("events", str, str2);
        return sVarA0 == null || sVarA0.f30400c < 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(ob.b4 r24, ob.g4 r25) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.V(ob.b4, ob.g4):void");
    }

    public final void W(String str, g4 g4Var) {
        e().C();
        k0();
        boolean zS = S(g4Var);
        String str2 = g4Var.f30131b;
        if (zS) {
            if (!g4Var.i) {
                b0(g4Var);
                return;
            }
            Boolean boolU = U(g4Var);
            if ("_npa".equals(str) && boolU != null) {
                b().f30417n.f("Falling back to manifest metadata value for ad personalization");
                o().getClass();
                V(new b4(System.currentTimeMillis(), Long.valueOf(true != boolU.booleanValue() ? 0L : 1L), "_npa", "auto"), g4Var);
                return;
            }
            ur urVar = b().f30417n;
            l1 l1Var = this.f30615m;
            urVar.g(l1Var.f30268k.c(str), "Removing user property");
            n nVar = this.f30607d;
            T(nVar);
            nVar.o0();
            try {
                b0(g4Var);
                if ("_id".equals(str)) {
                    n nVar2 = this.f30607d;
                    T(nVar2);
                    pa.c0.i(str2);
                    nVar2.u0(str2, "_lair");
                }
                n nVar3 = this.f30607d;
                T(nVar3);
                pa.c0.i(str2);
                nVar3.u0(str2, str);
                n nVar4 = this.f30607d;
                T(nVar4);
                nVar4.p0();
                b().f30417n.g(l1Var.f30268k.c(str), "User property removed");
                n nVar5 = this.f30607d;
                T(nVar5);
                nVar5.q0();
            } catch (Throwable th2) {
                n nVar6 = this.f30607d;
                T(nVar6);
                nVar6.q0();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0422 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ob.g4] */
    /* JADX WARN: Type inference failed for: r2v13, types: [ob.z3] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [ob.z3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(ob.g4 r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.X(ob.g4):void");
    }

    public final void Y(e eVar, g4 g4Var) {
        v vVar;
        pa.c0.f(eVar.f30073b);
        pa.c0.i(eVar.f30074c);
        pa.c0.i(eVar.f30075d);
        pa.c0.f(eVar.f30075d.f29965c);
        e().C();
        k0();
        if (S(g4Var)) {
            if (!g4Var.i) {
                b0(g4Var);
                return;
            }
            e eVar2 = new e(eVar);
            boolean z5 = false;
            eVar2.f30077f = false;
            n nVar = this.f30607d;
            T(nVar);
            nVar.o0();
            try {
                n nVar2 = this.f30607d;
                T(nVar2);
                String str = eVar2.f30073b;
                pa.c0.i(str);
                e eVarA0 = nVar2.A0(str, eVar2.f30075d.f29965c);
                l1 l1Var = this.f30615m;
                if (eVarA0 != null && !eVarA0.f30074c.equals(eVar2.f30074c)) {
                    b().f30413j.i("Updating a conditional user property with different origin. name, origin, origin (from DB)", l1Var.f30268k.c(eVar2.f30075d.f29965c), eVar2.f30074c, eVarA0.f30074c);
                }
                if (eVarA0 != null && eVarA0.f30077f) {
                    eVar2.f30074c = eVarA0.f30074c;
                    eVar2.f30076e = eVarA0.f30076e;
                    eVar2.i = eVarA0.i;
                    eVar2.f30078g = eVarA0.f30078g;
                    eVar2.f30080j = eVarA0.f30080j;
                    eVar2.f30077f = true;
                    b4 b4Var = eVar2.f30075d;
                    eVar2.f30075d = new b4(eVarA0.f30075d.f29966d, b4Var.h(), b4Var.f29965c, eVarA0.f30075d.f29969g);
                } else if (TextUtils.isEmpty(eVar2.f30078g)) {
                    b4 b4Var2 = eVar2.f30075d;
                    eVar2.f30075d = new b4(eVar2.f30076e, b4Var2.h(), b4Var2.f29965c, eVar2.f30075d.f29969g);
                    eVar2.f30077f = true;
                    z5 = true;
                }
                if (eVar2.f30077f) {
                    b4 b4Var3 = eVar2.f30075d;
                    String str2 = eVar2.f30073b;
                    pa.c0.i(str2);
                    String str3 = eVar2.f30074c;
                    String str4 = b4Var3.f29965c;
                    long j10 = b4Var3.f29966d;
                    Object objH = b4Var3.h();
                    pa.c0.i(objH);
                    c4 c4Var = new c4(str2, str3, str4, j10, objH);
                    Object obj = c4Var.f29992e;
                    String str5 = c4Var.f29990c;
                    n nVar3 = this.f30607d;
                    T(nVar3);
                    if (nVar3.v0(c4Var)) {
                        b().f30417n.i("User property updated immediately", eVar2.f30073b, l1Var.f30268k.c(str5), obj);
                    } else {
                        b().f30411g.i("(2)Too many active user properties, ignoring", s0.K(eVar2.f30073b), l1Var.f30268k.c(str5), obj);
                    }
                    if (z5 && (vVar = eVar2.f30080j) != null) {
                        k(new v(vVar, eVar2.f30076e), g4Var);
                    }
                }
                n nVar4 = this.f30607d;
                T(nVar4);
                if (nVar4.z0(eVar2)) {
                    b().f30417n.i("Conditional property added", eVar2.f30073b, l1Var.f30268k.c(eVar2.f30075d.f29965c), eVar2.f30075d.h());
                } else {
                    b().f30411g.i("Too many conditional properties, ignoring", s0.K(eVar2.f30073b), l1Var.f30268k.c(eVar2.f30075d.f29965c), eVar2.f30075d.h());
                }
                n nVar5 = this.f30607d;
                T(nVar5);
                nVar5.p0();
                n nVar6 = this.f30607d;
                T(nVar6);
                nVar6.q0();
            } catch (Throwable th2) {
                n nVar7 = this.f30607d;
                T(nVar7);
                nVar7.q0();
                throw th2;
            }
        }
    }

    public final void Z(e eVar, g4 g4Var) {
        pa.c0.f(eVar.f30073b);
        pa.c0.i(eVar.f30075d);
        pa.c0.f(eVar.f30075d.f29965c);
        e().C();
        k0();
        if (S(g4Var)) {
            if (!g4Var.i) {
                b0(g4Var);
                return;
            }
            n nVar = this.f30607d;
            T(nVar);
            nVar.o0();
            try {
                b0(g4Var);
                String str = eVar.f30073b;
                pa.c0.i(str);
                n nVar2 = this.f30607d;
                T(nVar2);
                e eVarA0 = nVar2.A0(str, eVar.f30075d.f29965c);
                l1 l1Var = this.f30615m;
                if (eVarA0 != null) {
                    b().f30417n.h(eVar.f30073b, "Removing conditional user property", l1Var.f30268k.c(eVar.f30075d.f29965c));
                    n nVar3 = this.f30607d;
                    T(nVar3);
                    nVar3.B0(str, eVar.f30075d.f29965c);
                    if (eVarA0.f30077f) {
                        n nVar4 = this.f30607d;
                        T(nVar4);
                        nVar4.u0(str, eVar.f30075d.f29965c);
                    }
                    v vVar = eVar.f30082l;
                    if (vVar != null) {
                        u uVar = vVar.f30455c;
                        v vVarD0 = j0().d0(vVar.f30454b, uVar != null ? uVar.f() : null, eVarA0.f30074c, vVar.f30457e, true);
                        pa.c0.i(vVarD0);
                        k(vVarD0, g4Var);
                    }
                } else {
                    b().f30413j.h(s0.K(eVar.f30073b), "Conditional user property doesn't exist", l1Var.f30268k.c(eVar.f30075d.f29965c));
                }
                n nVar5 = this.f30607d;
                T(nVar5);
                nVar5.p0();
                n nVar6 = this.f30607d;
                T(nVar6);
                nVar6.q0();
            } catch (Throwable th2) {
                n nVar7 = this.f30607d;
                T(nVar7);
                nVar7.q0();
                throw th2;
            }
        }
    }

    public final x1 a(String str) {
        x1 x1Var = x1.f30509c;
        e().C();
        k0();
        HashMap map = this.C;
        x1 x1VarV = (x1) map.get(str);
        if (x1VarV == null) {
            n nVar = this.f30607d;
            T(nVar);
            x1VarV = nVar.V(str);
            if (x1VarV == null) {
                x1VarV = x1.f30509c;
            }
            e().C();
            k0();
            map.put(str, x1VarV);
            n nVar2 = this.f30607d;
            T(nVar2);
            nVar2.X(str, x1VarV);
        }
        return x1VarV;
    }

    public final void a0(g4 g4Var, long j10) throws Throwable {
        n nVar = this.f30607d;
        T(nVar);
        String str = g4Var.f30131b;
        pa.c0.i(str);
        w0 w0VarE0 = nVar.E0(str);
        if (w0VarE0 != null) {
            j0();
            String str2 = g4Var.f30132c;
            String strG = w0VarE0.G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strG);
            if (!zIsEmpty && !zIsEmpty2) {
                pa.c0.i(str2);
                if (!str2.equals(strG)) {
                    b().f30413j.g(s0.K(w0VarE0.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    n nVar2 = this.f30607d;
                    T(nVar2);
                    l1 l1Var = (l1) nVar2.f15951b;
                    String strD = w0VarE0.D();
                    nVar2.D();
                    nVar2.C();
                    pa.c0.f(strD);
                    try {
                        SQLiteDatabase sQLiteDatabaseR0 = nVar2.r0();
                        String[] strArr = {strD};
                        int iDelete = sQLiteDatabaseR0.delete("events", "app_id=?", strArr) + sQLiteDatabaseR0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseR0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseR0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseR0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseR0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseR0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseR0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseR0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseR0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseR0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseR0.delete("trigger_uris", "app_id=?", strArr);
                        if (l1Var.f30263e.M(null, d0.f30018h1)) {
                            iDelete += sQLiteDatabaseR0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            s0 s0Var = l1Var.f30265g;
                            l1.k(s0Var);
                            s0Var.f30418o.h(strD, "Deleted application data. app, records", Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e3) {
                        s0 s0Var2 = l1Var.f30265g;
                        l1.k(s0Var2);
                        s0Var2.f30411g.h(s0.K(strD), "Error deleting application data. appId, error", e3);
                    }
                    w0VarE0 = null;
                }
            }
        }
        if (w0VarE0 != null) {
            boolean z5 = (w0VarE0.P() == -2147483648L || w0VarE0.P() == g4Var.f30139k) ? false : true;
            String strN = w0VarE0.N();
            if (z5 || ((w0VarE0.P() != -2147483648L || strN == null || strN.equals(g4Var.f30133d)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strN);
                v vVar = new v("_au", new u(bundle), "auto", j10);
                if (d0().M(null, d0.f30004c1)) {
                    f(vVar, g4Var);
                } else {
                    h(vVar, g4Var);
                }
            }
        }
    }

    @Override // ob.t1
    public final s0 b() {
        l1 l1Var = this.f30615m;
        pa.c0.i(l1Var);
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        return s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.w0 b0(ob.g4 r13) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.b0(ob.g4):ob.w0");
    }

    public final long c() {
        o().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        f3 f3Var = this.f30612j;
        f3Var.D();
        f3Var.C();
        y0 y0Var = f3Var.f30117k;
        long jF = y0Var.f();
        if (jF == 0) {
            e4 e4Var = ((l1) f3Var.f15951b).f30267j;
            l1.h(e4Var);
            jF = ((long) e4Var.y0().nextInt(86400000)) + 1;
            y0Var.g(jF);
        }
        return ((((jCurrentTimeMillis + jF) / 1000) / 60) / 60) / 24;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List c0(Bundle bundle, g4 g4Var) {
        int[] iArr;
        e().C();
        t8.a();
        g gVarD0 = d0();
        String str = g4Var.f30131b;
        if (!gVarD0.M(str, d0.P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    b().f30411g.f("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        n nVar = this.f30607d;
                        T(nVar);
                        l1 l1Var = (l1) nVar.f15951b;
                        int i10 = intArray[i];
                        long j10 = longArray[i];
                        pa.c0.f(str);
                        nVar.C();
                        nVar.D();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = nVar.r0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i10), String.valueOf(j10)});
                                s0 s0Var = l1Var.f30265g;
                                l1.k(s0Var);
                                ur urVar = s0Var.f30418o;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb2.append("Pruned ");
                                sb2.append(iDelete);
                                sb2.append(" trigger URIs. appId, source, timestamp");
                                urVar.i(sb2.toString(), str, Integer.valueOf(i10), Long.valueOf(j10));
                            } catch (SQLiteException e3) {
                                e = e3;
                                s0 s0Var2 = l1Var.f30265g;
                                l1.k(s0Var2);
                                s0Var2.f30411g.h(s0.K(str), "Error pruning trigger URIs. appId", e);
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        n nVar2 = this.f30607d;
        T(nVar2);
        String str2 = g4Var.f30131b;
        pa.c0.f(str2);
        nVar2.C();
        nVar2.D();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = nVar2.r0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new o3(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                s0 s0Var3 = ((l1) nVar2.f15951b).f30265g;
                l1.k(s0Var3);
                s0Var3.f30411g.h(s0.K(str2), "Error querying trigger uris. appId", e10);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public final void d(String str, v vVar) {
        n nVar = this.f30607d;
        T(nVar);
        w0 w0VarE0 = nVar.E0(str);
        if (w0VarE0 != null) {
            l1 l1Var = w0VarE0.f30468a;
            if (!TextUtils.isEmpty(w0VarE0.N())) {
                Boolean boolP = P(w0VarE0);
                if (boolP == null) {
                    if (!"_ui".equals(vVar.f30454b)) {
                        b().f30413j.g(s0.K(str), "Could not find package. appId");
                    }
                } else if (!boolP.booleanValue()) {
                    b().f30411g.g(s0.K(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strG = w0VarE0.G();
                String strN = w0VarE0.N();
                long jP = w0VarE0.P();
                i1 i1Var = l1Var.f30266h;
                l1.k(i1Var);
                i1Var.C();
                String str2 = w0VarE0.f30478l;
                i1 i1Var2 = l1Var.f30266h;
                l1.k(i1Var2);
                i1Var2.C();
                long j10 = w0VarE0.f30479m;
                i1 i1Var3 = l1Var.f30266h;
                l1.k(i1Var3);
                i1Var3.C();
                long j11 = w0VarE0.f30480n;
                i1 i1Var4 = l1Var.f30266h;
                l1.k(i1Var4);
                i1Var4.C();
                boolean z5 = w0VarE0.f30481o;
                String strJ = w0VarE0.J();
                i1 i1Var5 = l1Var.f30266h;
                l1.k(i1Var5);
                i1Var5.C();
                boolean z10 = w0VarE0.f30482p;
                Boolean boolW = w0VarE0.w();
                long jB = w0VarE0.b();
                i1 i1Var6 = l1Var.f30266h;
                l1.k(i1Var6);
                i1Var6.C();
                ArrayList arrayList = w0VarE0.f30485s;
                String strG2 = a(str).g();
                boolean zY = w0VarE0.y();
                i1 i1Var7 = l1Var.f30266h;
                l1.k(i1Var7);
                i1Var7.C();
                long j12 = w0VarE0.f30488v;
                int i = a(str).f30511b;
                String str3 = n0(str).f30335b;
                i1 i1Var8 = l1Var.f30266h;
                l1.k(i1Var8);
                i1Var8.C();
                int i10 = w0VarE0.f30490x;
                i1 i1Var9 = l1Var.f30266h;
                l1.k(i1Var9);
                i1Var9.C();
                f(vVar, new g4(str, strG, strN, jP, str2, j10, j11, (String) null, z5, false, strJ, 0L, 0, z10, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j12, i, str3, i10, w0VarE0.B, w0VarE0.C(), w0VarE0.s(), 0L, w0VarE0.t()));
                return;
            }
        }
        b().f30417n.g(str, "No app data available; dropping event");
    }

    public final g d0() {
        l1 l1Var = this.f30615m;
        pa.c0.i(l1Var);
        return l1Var.f30263e;
    }

    @Override // ob.t1
    public final i1 e() {
        l1 l1Var = this.f30615m;
        pa.c0.i(l1Var);
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        return i1Var;
    }

    public final e1 e0() {
        e1 e1Var = this.f30605b;
        T(e1Var);
        return e1Var;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:18:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(ob.v r11, ob.g4 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.f(ob.v, ob.g4):void");
    }

    public final n f0() {
        n nVar = this.f30607d;
        T(nVar);
        return nVar;
    }

    @Override // ob.t1
    public final l7.b g() {
        return this.f30615m.f30262d;
    }

    public final d8.o0 g0() {
        d8.o0 o0Var = this.f30608e;
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final void h(v vVar, g4 g4Var) {
        v vVar2;
        List listD0;
        l1 l1Var;
        List listD02;
        List<e> listD03;
        String str;
        pa.c0.i(g4Var);
        String str2 = g4Var.f30131b;
        pa.c0.f(str2);
        e().C();
        k0();
        long j10 = vVar.f30457e;
        dl.k kVarE = dl.k.e(vVar);
        e().C();
        e4.s0((this.G == null || (str = this.H) == null || !str.equals(str2)) ? null : this.G, (Bundle) kVarE.f15874e, false);
        v vVarF = kVarE.f();
        i0();
        if (TextUtils.isEmpty(g4Var.f30132c)) {
            return;
        }
        if (!g4Var.i) {
            b0(g4Var);
            return;
        }
        List list = g4Var.f30147s;
        if (list != null) {
            String str3 = vVarF.f30454b;
            if (!list.contains(str3)) {
                b().f30417n.i("Dropping non-safelisted event. appId, event name, origin", str2, vVarF.f30454b, vVarF.f30456d);
                return;
            } else {
                Bundle bundleF = vVarF.f30455c.f();
                bundleF.putLong("ga_safelisted", 1L);
                vVar2 = new v(str3, new u(bundleF), vVarF.f30456d, vVarF.f30457e);
            }
        } else {
            vVar2 = vVarF;
        }
        n nVar = this.f30607d;
        T(nVar);
        nVar.o0();
        try {
            String str4 = vVar2.f30454b;
            if ("_s".equals(str4)) {
                n nVar2 = this.f30607d;
                T(nVar2);
                if (!nVar2.R(str2, "_s") && vVar2.f30455c.f30430b.getLong("_sid") != 0) {
                    n nVar3 = this.f30607d;
                    T(nVar3);
                    if (nVar3.R(str2, "_f")) {
                        n nVar4 = this.f30607d;
                        T(nVar4);
                        nVar4.U(str2, null, "_sid", i(str2, vVar2));
                    } else {
                        n nVar5 = this.f30607d;
                        T(nVar5);
                        if (nVar5.R(str2, "_v")) {
                            n nVar42 = this.f30607d;
                            T(nVar42);
                            nVar42.U(str2, null, "_sid", i(str2, vVar2));
                        } else {
                            n nVar6 = this.f30607d;
                            T(nVar6);
                            o().getClass();
                            nVar6.U(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", i(str2, vVar2));
                        }
                    }
                }
            }
            n nVar7 = this.f30607d;
            T(nVar7);
            pa.c0.f(str2);
            nVar7.C();
            nVar7.D();
            if (j10 < 0) {
                s0 s0Var = ((l1) nVar7.f15951b).f30265g;
                l1.k(s0Var);
                s0Var.f30413j.h(s0.K(str2), "Invalid time querying timed out conditional properties", Long.valueOf(j10));
                listD0 = Collections.EMPTY_LIST;
            } else {
                listD0 = nVar7.D0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
            }
            Iterator it = listD0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                l1Var = this.f30615m;
                if (!zHasNext) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar != null) {
                    b().f30418o.i("User property timed out", eVar.f30073b, l1Var.f30268k.c(eVar.f30075d.f29965c), eVar.f30075d.h());
                    v vVar3 = eVar.f30079h;
                    if (vVar3 != null) {
                        k(new v(vVar3, j10), g4Var);
                    }
                    n nVar8 = this.f30607d;
                    T(nVar8);
                    nVar8.B0(str2, eVar.f30075d.f29965c);
                }
            }
            n nVar9 = this.f30607d;
            T(nVar9);
            pa.c0.f(str2);
            nVar9.C();
            nVar9.D();
            if (j10 < 0) {
                s0 s0Var2 = ((l1) nVar9.f15951b).f30265g;
                l1.k(s0Var2);
                s0Var2.f30413j.h(s0.K(str2), "Invalid time querying expired conditional properties", Long.valueOf(j10));
                listD02 = Collections.EMPTY_LIST;
            } else {
                listD02 = nVar9.D0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
            }
            ArrayList arrayList = new ArrayList(listD02.size());
            Iterator it2 = listD02.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar2 != null) {
                    Iterator it3 = it2;
                    b().f30418o.i("User property expired", eVar2.f30073b, l1Var.f30268k.c(eVar2.f30075d.f29965c), eVar2.f30075d.h());
                    n nVar10 = this.f30607d;
                    T(nVar10);
                    nVar10.u0(str2, eVar2.f30075d.f29965c);
                    v vVar4 = eVar2.f30082l;
                    if (vVar4 != null) {
                        arrayList.add(vVar4);
                    }
                    n nVar11 = this.f30607d;
                    T(nVar11);
                    nVar11.B0(str2, eVar2.f30075d.f29965c);
                    it2 = it3;
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                k(new v((v) it4.next(), j10), g4Var);
            }
            n nVar12 = this.f30607d;
            T(nVar12);
            pa.c0.f(str2);
            pa.c0.f(str4);
            nVar12.C();
            nVar12.D();
            if (j10 < 0) {
                l1 l1Var2 = (l1) nVar12.f15951b;
                s0 s0Var3 = l1Var2.f30265g;
                l1.k(s0Var3);
                s0Var3.f30413j.i("Invalid time querying triggered conditional properties", s0.K(str2), l1Var2.f30268k.a(str4), Long.valueOf(j10));
                listD03 = Collections.EMPTY_LIST;
            } else {
                listD03 = nVar12.D0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
            }
            ArrayList arrayList2 = new ArrayList(listD03.size());
            for (e eVar3 : listD03) {
                if (eVar3 != null) {
                    b4 b4Var = eVar3.f30075d;
                    String str5 = eVar3.f30073b;
                    pa.c0.i(str5);
                    String str6 = eVar3.f30074c;
                    String str7 = b4Var.f29965c;
                    Object objH = b4Var.h();
                    pa.c0.i(objH);
                    c4 c4Var = new c4(str5, str6, str7, j10, objH);
                    Object obj = c4Var.f29992e;
                    String str8 = c4Var.f29990c;
                    n nVar13 = this.f30607d;
                    T(nVar13);
                    if (nVar13.v0(c4Var)) {
                        b().f30418o.i("User property triggered", eVar3.f30073b, l1Var.f30268k.c(str8), obj);
                    } else {
                        b().f30411g.i("Too many active user properties, ignoring", s0.K(eVar3.f30073b), l1Var.f30268k.c(str8), obj);
                    }
                    v vVar5 = eVar3.f30080j;
                    if (vVar5 != null) {
                        arrayList2.add(vVar5);
                    }
                    eVar3.f30075d = new b4(c4Var);
                    eVar3.f30077f = true;
                    n nVar14 = this.f30607d;
                    T(nVar14);
                    nVar14.z0(eVar3);
                }
            }
            k(vVar2, g4Var);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                k(new v((v) it5.next(), j10), g4Var);
            }
            n nVar15 = this.f30607d;
            T(nVar15);
            nVar15.p0();
            n nVar16 = this.f30607d;
            T(nVar16);
            nVar16.q0();
        } catch (Throwable th2) {
            n nVar17 = this.f30607d;
            T(nVar17);
            nVar17.q0();
            throw th2;
        }
    }

    public final c h0() {
        c cVar = this.f30610g;
        T(cVar);
        return cVar;
    }

    public final Bundle i(String str, v vVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", vVar.f30455c.f30430b.getLong("_sid"));
        n nVar = this.f30607d;
        T(nVar);
        c4 c4VarW0 = nVar.w0(str, "_sno");
        if (c4VarW0 != null) {
            Object obj = c4VarW0.f29992e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final v0 i0() {
        v0 v0Var = this.f30611h;
        T(v0Var);
        return v0Var;
    }

    @Override // ob.t1
    public final Context j() {
        return this.f30615m.f30260b;
    }

    public final e4 j0() {
        l1 l1Var = this.f30615m;
        pa.c0.i(l1Var);
        e4 e4Var = l1Var.f30267j;
        l1.h(e4Var);
        return e4Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:74|(12:76|(0)(1:79)|80|87|(1:89)|91|(0)(0)|94|102|(0)(0)|157|158)|78|81|396|82|86|80|87|(0)(0)|91|(0)(0)|94|102|(0)(0)|157|158) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02fe, code lost:
    
        ((ob.l1) r10.f15951b).b().G().h(ob.s0.K(r13), "Error pruning currencies. appId", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0890 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08a0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x09b6 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:273:0x08b9, B:275:0x08c4, B:277:0x08d2, B:279:0x08dc, B:282:0x08f0, B:284:0x08fc, B:286:0x0908, B:288:0x0912, B:290:0x0920, B:292:0x0938, B:296:0x0951, B:298:0x095f, B:299:0x0968, B:301:0x0973, B:303:0x09b6, B:306:0x09c1, B:307:0x09cb, B:308:0x09cc, B:310:0x09d6, B:276:0x08c9), top: B:390:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x09d6 A[Catch: all -> 0x094a, TRY_LEAVE, TryCatch #5 {all -> 0x094a, blocks: (B:273:0x08b9, B:275:0x08c4, B:277:0x08d2, B:279:0x08dc, B:282:0x08f0, B:284:0x08fc, B:286:0x0908, B:288:0x0912, B:290:0x0920, B:292:0x0938, B:296:0x0951, B:298:0x095f, B:299:0x0968, B:301:0x0973, B:303:0x09b6, B:306:0x09c1, B:307:0x09cb, B:308:0x09cc, B:310:0x09d6, B:276:0x08c9), top: B:390:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0a47 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a65 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0a7e A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0b84 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c2c A[Catch: all -> 0x0a04, SQLiteException -> 0x0c42, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0c42, blocks: (B:360:0x0c1b, B:362:0x0c2c), top: B:388:0x0c1b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0b92 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(ob.v r60, ob.g4 r61) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.k(ob.v, ob.g4):void");
    }

    public final void k0() {
        if (!this.f30616n.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void l(w0 w0Var, com.google.android.gms.internal.measurement.k3 k3Var) {
        ni.i iVar;
        com.google.android.gms.internal.measurement.u3 u3Var;
        h hVar;
        e().C();
        k0();
        String strB0 = ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).B0();
        EnumMap enumMap = new EnumMap(w1.class);
        int length = strB0.length();
        int length2 = w1.values().length;
        h hVar2 = h.UNSET;
        int i = 0;
        if (length < length2 || strB0.charAt(0) != '1') {
            iVar = new ni.i(2);
        } else {
            w1[] w1VarArrValues = w1.values();
            int length3 = w1VarArrValues.length;
            int i10 = 0;
            int i11 = 1;
            while (i10 < length3) {
                w1 w1Var = w1VarArrValues[i10];
                int i12 = i11 + 1;
                char cCharAt = strB0.charAt(i11);
                h[] hVarArrValues = h.values();
                int length4 = hVarArrValues.length;
                int i13 = i;
                while (true) {
                    if (i13 >= length4) {
                        hVar = hVar2;
                        break;
                    }
                    hVar = hVarArrValues[i13];
                    if (hVar.f30164b == cCharAt) {
                        break;
                    } else {
                        i13++;
                    }
                }
                enumMap.put(w1Var, hVar);
                i10++;
                i11 = i12;
                i = 0;
            }
            iVar = new ni.i(enumMap);
        }
        String strD = w0Var.D();
        e().C();
        k0();
        x1 x1VarA = a(strD);
        EnumMap enumMap2 = x1VarA.f30510a;
        w1 w1Var2 = w1.AD_STORAGE;
        u1 u1Var = (u1) enumMap2.get(w1Var2);
        u1 u1Var2 = u1.UNINITIALIZED;
        if (u1Var == null) {
            u1Var = u1Var2;
        }
        int i14 = x1VarA.f30511b;
        int iOrdinal = u1Var.ordinal();
        h hVar3 = h.REMOTE_ENFORCED_DEFAULT;
        h hVar4 = h.FAILSAFE;
        if (iOrdinal == 1) {
            iVar.G(w1Var2, hVar3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            iVar.F(w1Var2, i14);
        } else {
            iVar.G(w1Var2, hVar4);
        }
        w1 w1Var3 = w1.ANALYTICS_STORAGE;
        u1 u1Var3 = (u1) enumMap2.get(w1Var3);
        if (u1Var3 != null) {
            u1Var2 = u1Var3;
        }
        int iOrdinal2 = u1Var2.ordinal();
        if (iOrdinal2 == 1) {
            iVar.G(w1Var3, hVar3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            iVar.F(w1Var3, i14);
        } else {
            iVar.G(w1Var3, hVar4);
        }
        String strD2 = w0Var.D();
        e().C();
        k0();
        p pVarP0 = p0(strD2, n0(strD2), a(strD2), iVar);
        String str = pVarP0.f30337d;
        Boolean bool = pVarP0.f30336c;
        pa.c0.i(bool);
        boolean zBooleanValue = bool.booleanValue();
        k3Var.b();
        ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).f1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            k3Var.b();
            ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).g1(str);
        }
        e().C();
        k0();
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).U1()).iterator();
        while (true) {
            if (it.hasNext()) {
                u3Var = (com.google.android.gms.internal.measurement.u3) it.next();
                if ("_npa".equals(u3Var.r())) {
                    break;
                }
            } else {
                u3Var = null;
                break;
            }
        }
        if (u3Var != null) {
            EnumMap enumMap3 = (EnumMap) iVar.f29407c;
            w1 w1Var4 = w1.AD_PERSONALIZATION;
            h hVar5 = (h) enumMap3.get(w1Var4);
            if (hVar5 == null) {
                hVar5 = hVar2;
            }
            if (hVar5 == hVar2) {
                n nVar = this.f30607d;
                T(nVar);
                c4 c4VarW0 = nVar.w0(w0Var.D(), "_npa");
                h hVar6 = h.MANIFEST;
                h hVar7 = h.API;
                if (c4VarW0 != null) {
                    String str2 = c4VarW0.f29989b;
                    if ("tcf".equals(str2)) {
                        iVar.G(w1Var4, h.TCF);
                    } else if (App.TYPE.equals(str2)) {
                        iVar.G(w1Var4, hVar7);
                    } else {
                        iVar.G(w1Var4, hVar6);
                    }
                } else {
                    Boolean boolW = w0Var.w();
                    if (boolW == null || ((boolW.booleanValue() && u3Var.v() != 1) || !(boolW.booleanValue() || u3Var.v() == 0))) {
                        iVar.G(w1Var4, hVar7);
                    } else {
                        iVar.G(w1Var4, hVar6);
                    }
                }
            }
        } else {
            int iF = F(w0Var.D(), iVar);
            com.google.android.gms.internal.measurement.t3 t3VarA = com.google.android.gms.internal.measurement.u3.A();
            t3VarA.b();
            ((com.google.android.gms.internal.measurement.u3) t3VarA.f13840c).C("_npa");
            o().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            t3VarA.b();
            ((com.google.android.gms.internal.measurement.u3) t3VarA.f13840c).B(jCurrentTimeMillis);
            t3VarA.b();
            ((com.google.android.gms.internal.measurement.u3) t3VarA.f13840c).F(iF);
            com.google.android.gms.internal.measurement.u3 u3Var2 = (com.google.android.gms.internal.measurement.u3) t3VarA.e();
            k3Var.b();
            ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).d0(u3Var2);
            b().f30418o.h("non_personalized_ads(_npa)", "Setting user property", Integer.valueOf(iF));
        }
        String string = iVar.toString();
        k3Var.b();
        ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).e1(string);
        String strD3 = w0Var.D();
        e1 e1Var = this.f30605b;
        e1Var.C();
        e1Var.I(strD3);
        com.google.android.gms.internal.measurement.c2 c2VarX = e1Var.X(strD3);
        boolean z5 = c2VarX == null || !c2VarX.s() || c2VarX.t();
        List listU = k3Var.U();
        for (int i15 = 0; i15 < listU.size(); i15++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.d3) listU.get(i15)).s())) {
                com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) ((com.google.android.gms.internal.measurement.d3) listU.get(i15)).i();
                List listH = c3Var.h();
                int i16 = 0;
                while (true) {
                    if (i16 >= listH.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.g3) listH.get(i16)).q())) {
                        String strS = ((com.google.android.gms.internal.measurement.g3) listH.get(i16)).s();
                        if (z5 && strS.length() > 4) {
                            char[] charArray = strS.toCharArray();
                            int i17 = 1;
                            while (true) {
                                if (i17 >= 64) {
                                    i17 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17 | 1);
                            strS = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.f3 f3VarB = com.google.android.gms.internal.measurement.g3.B();
                        f3VarB.h("_tcfd");
                        f3VarB.i(strS);
                        c3Var.b();
                        ((com.google.android.gms.internal.measurement.d3) c3Var.f13840c).A(i16, (com.google.android.gms.internal.measurement.g3) f3VarB.e());
                    } else {
                        i16++;
                    }
                }
                k3Var.W(i15, c3Var);
                return;
            }
        }
    }

    public final void l0(g4 g4Var) {
        e().C();
        k0();
        String str = g4Var.f30131b;
        pa.c0.f(str);
        x1 x1VarC = x1.c(g4Var.f30153y, g4Var.f30148t);
        a(str);
        b().f30418o.h(str, "Setting storage consent for package", x1VarC);
        e().C();
        k0();
        this.C.put(str, x1VarC);
        n nVar = this.f30607d;
        T(nVar);
        nVar.X(str, x1VarC);
    }

    public final void m(w0 w0Var, com.google.android.gms.internal.measurement.k3 k3Var) {
        Serializable serializableR;
        e().C();
        k0();
        com.google.android.gms.internal.measurement.n2 n2VarO = com.google.android.gms.internal.measurement.q2.O();
        l1 l1Var = w0Var.f30468a;
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        i1Var.C();
        byte[] bArr = w0Var.H;
        if (bArr != null) {
            try {
                n2VarO = (com.google.android.gms.internal.measurement.n2) v0.p0(n2VarO, bArr);
            } catch (t5 unused) {
                b().f30413j.g(s0.K(w0Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = k3Var.U().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) it.next();
            if (d3Var.s().equals("_cmp")) {
                com.google.android.gms.internal.measurement.g3 g3VarK = v0.K(d3Var, "gclid");
                Serializable serializableR2 = g3VarK == null ? null : v0.R(g3VarK);
                if (serializableR2 == null) {
                    serializableR2 = "";
                }
                String str = (String) serializableR2;
                com.google.android.gms.internal.measurement.g3 g3VarK2 = v0.K(d3Var, "gbraid");
                Serializable serializableR3 = g3VarK2 == null ? null : v0.R(g3VarK2);
                if (serializableR3 == null) {
                    serializableR3 = "";
                }
                String str2 = (String) serializableR3;
                com.google.android.gms.internal.measurement.g3 g3VarK3 = v0.K(d3Var, "gad_source");
                Serializable serializableR4 = g3VarK3 == null ? null : v0.R(g3VarK3);
                String str3 = (String) (serializableR4 != null ? serializableR4 : "");
                String[] strArrSplit = ((String) d0.f30016g1.a(null)).split(StringUtils.COMMA);
                i0();
                HashMap map = new HashMap();
                for (com.google.android.gms.internal.measurement.g3 g3Var : d3Var.p()) {
                    if (Arrays.asList(strArrSplit).contains(g3Var.q()) && (serializableR = v0.R(g3Var)) != null) {
                        map.put(g3Var.q(), serializableR);
                    }
                }
                if (!map.isEmpty()) {
                    com.google.android.gms.internal.measurement.g3 g3VarK4 = v0.K(d3Var, "click_timestamp");
                    Serializable serializableR5 = g3VarK4 == null ? null : v0.R(g3VarK4);
                    long jLongValue = ((Long) (serializableR5 != null ? serializableR5 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = d3Var.u();
                    }
                    com.google.android.gms.internal.measurement.g3 g3VarK5 = v0.K(d3Var, "_cis");
                    if ("referrer API v2".equals(g3VarK5 != null ? v0.R(g3VarK5) : null)) {
                        if (jLongValue > ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).N()) {
                            if (str.isEmpty()) {
                                n2VarO.b();
                                ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).q();
                            } else {
                                n2VarO.b();
                                ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).p(str);
                            }
                            if (str2.isEmpty()) {
                                n2VarO.b();
                                ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).s();
                            } else {
                                n2VarO.b();
                                ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).r(str2);
                            }
                            if (str3.isEmpty()) {
                                n2VarO.b();
                                ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).u();
                            } else {
                                n2VarO.b();
                                ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).t(str3);
                            }
                            n2VarO.b();
                            ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).v(jLongValue);
                            n2VarO.b();
                            ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).x().clear();
                            HashMap mapG = G(d3Var);
                            n2VarO.b();
                            ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).x().putAll(mapG);
                        }
                    } else if (jLongValue > ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).F()) {
                        if (str.isEmpty()) {
                            n2VarO.b();
                            ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).R();
                        } else {
                            n2VarO.b();
                            ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).Q(str);
                        }
                        if (str2.isEmpty()) {
                            n2VarO.b();
                            ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).T();
                        } else {
                            n2VarO.b();
                            ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).S(str2);
                        }
                        if (str3.isEmpty()) {
                            n2VarO.b();
                            ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).V();
                        } else {
                            n2VarO.b();
                            ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).U(str3);
                        }
                        n2VarO.b();
                        ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).W(jLongValue);
                        n2VarO.b();
                        ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).w().clear();
                        HashMap mapG2 = G(d3Var);
                        n2VarO.b();
                        ((com.google.android.gms.internal.measurement.q2) n2VarO.f13840c).w().putAll(mapG2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.q2) n2VarO.e()).equals(com.google.android.gms.internal.measurement.q2.P())) {
            com.google.android.gms.internal.measurement.q2 q2Var = (com.google.android.gms.internal.measurement.q2) n2VarO.e();
            k3Var.b();
            ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).k1(q2Var);
        }
        byte[] bArrA = ((com.google.android.gms.internal.measurement.q2) n2VarO.e()).a();
        i1 i1Var2 = l1Var.f30266h;
        l1.k(i1Var2);
        i1Var2.C();
        w0Var.Q |= w0Var.H != bArrA;
        w0Var.H = bArrA;
        if (w0Var.o()) {
            n nVar = this.f30607d;
            T(nVar);
            nVar.F0(w0Var, false);
        }
        if (d0().M(null, d0.f30013f1)) {
            n nVar2 = this.f30607d;
            T(nVar2);
            nVar2.u0(w0Var.D(), "_lgclid");
        }
    }

    public final void m0(g4 g4Var) {
        e().C();
        k0();
        String str = g4Var.f30131b;
        pa.c0.f(str);
        p pVarB = p.b(g4Var.f30154z);
        b().f30418o.h(str, "Setting DMA consent for package", pVarB);
        e().C();
        k0();
        u1 u1VarA = p.c(100, o0(str)).a();
        this.D.put(str, pVarB);
        n nVar = this.f30607d;
        T(nVar);
        pa.c0.i(str);
        pa.c0.i(pVarB);
        nVar.C();
        nVar.D();
        x1 x1VarV = nVar.V(str);
        x1 x1Var = x1.f30509c;
        if (x1VarV == x1Var) {
            nVar.X(str, x1Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.APP_ID, str);
        contentValues.put("dma_consent_settings", pVarB.f30335b);
        nVar.Z(contentValues);
        u1 u1VarA2 = p.c(100, o0(str)).a();
        e().C();
        k0();
        u1 u1Var = u1.GRANTED;
        u1 u1Var2 = u1.DENIED;
        boolean z5 = u1VarA == u1Var2 && u1VarA2 == u1Var;
        boolean z10 = u1VarA == u1Var && u1VarA2 == u1Var2;
        if (z5 || z10) {
            b().f30418o.g(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            n nVar2 = this.f30607d;
            T(nVar2);
            if (nVar2.G0(c(), str, false, false, false, false).f30205f < d0().K(str, d0.f30030m0)) {
                bundle.putLong("_r", 1L);
                n nVar3 = this.f30607d;
                T(nVar3);
                b().f30418o.h(str, "_dcu realtime event count", Long.valueOf(nVar3.G0(c(), str, false, false, true, false).f30205f));
            }
            this.K.g0(str, "_dcu", bundle);
        }
    }

    public final String n(x1 x1Var) {
        if (!x1Var.i(w1.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        j0().y0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final p n0(String str) {
        e().C();
        k0();
        HashMap map = this.D;
        p pVar = (p) map.get(str);
        if (pVar != null) {
            return pVar;
        }
        n nVar = this.f30607d;
        T(nVar);
        pa.c0.i(str);
        nVar.C();
        nVar.D();
        p pVarB = p.b(nVar.Y("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, pVarB);
        return pVarB;
    }

    @Override // ob.t1
    public final ua.a o() {
        l1 l1Var = this.f30615m;
        pa.c0.i(l1Var);
        return l1Var.f30269l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final Bundle o0(String str) {
        e().C();
        k0();
        e1 e1Var = this.f30605b;
        T(e1Var);
        if (e1Var.X(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        x1 x1VarA = a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = x1VarA.f30510a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((u1) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((w1) entry.getKey()).f30498b, str2);
            }
        }
        bundle.putAll(bundle2);
        p pVarP0 = p0(str, n0(str), x1VarA, new ni.i(2));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : pVarP0.f30338e.entrySet()) {
            int iOrdinal2 = ((u1) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((w1) entry2.getKey()).f30498b, str3);
            }
        }
        Boolean bool = pVarP0.f30336c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = pVarP0.f30337d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        n nVar = this.f30607d;
        T(nVar);
        c4 c4VarW0 = nVar.w0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (c4VarW0 != null ? c4VarW0.f29992e.equals(1L) : F(str, new ni.i(2))) ? "granted" : "denied");
        return bundle;
    }

    public final void p(ArrayList arrayList) {
        pa.c0.b(!arrayList.isEmpty());
        if (this.f30628z != null) {
            b().f30411g.f("Set uploading progress before finishing the previous upload");
        } else {
            this.f30628z = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.p p0(java.lang.String r12, ob.p r13, ob.x1 r14, ni.i r15) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.p0(java.lang.String, ob.p, ob.x1, ni.i):ob.p");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ob.z3] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.q():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r0 r11 r22 r24
      0x006f: PHI (r0v122 java.util.List) = (r0v8 java.util.List), (r0v144 java.util.List) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r11v48 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v50 android.database.Cursor) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r22v28 ??) = (r22v40 ??), (r22v41 ??) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r24v7 long) = (r24v2 long), (r24v8 long) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x08ae A[LOOP:7: B:345:0x08a8->B:347:0x08ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0801 A[EDGE_INSN: B:447:0x0801->B:317:0x0801 BREAK  A[LOOP:4: B:263:0x0658->B:316:0x07f3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x07f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0865 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:489:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r22v28 */
    /* JADX WARN: Type inference failed for: r22v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v32 */
    /* JADX WARN: Type inference failed for: r22v33 */
    /* JADX WARN: Type inference failed for: r22v34 */
    /* JADX WARN: Type inference failed for: r22v35 */
    /* JADX WARN: Type inference failed for: r22v36 */
    /* JADX WARN: Type inference failed for: r22v37 */
    /* JADX WARN: Type inference failed for: r22v38 */
    /* JADX WARN: Type inference failed for: r22v39 */
    /* JADX WARN: Type inference failed for: r22v40 */
    /* JADX WARN: Type inference failed for: r22v41 */
    /* JADX WARN: Type inference failed for: r22v42 */
    /* JADX WARN: Type inference failed for: r22v43 */
    /* JADX WARN: Type inference failed for: r22v44 */
    /* JADX WARN: Type inference failed for: r22v45 */
    /* JADX WARN: Type inference failed for: r22v46 */
    /* JADX WARN: Type inference failed for: r22v47 */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, ob.z3] */
    /* JADX WARN: Type inference failed for: r8v60, types: [ob.q3] */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v82 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(long r34, java.lang.String r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.r(long, java.lang.String):void");
    }

    public final boolean s(String str, String str2) {
        n nVar = this.f30607d;
        T(nVar);
        w0 w0VarE0 = nVar.E0(str);
        HashMap map = this.F;
        if (w0VarE0 != null && j0().b0(str, w0VarE0.C())) {
            map.remove(str2);
            return true;
        }
        y3 y3Var = (y3) map.get(str2);
        if (y3Var != null) {
            y3Var.f30556a.o().getClass();
            if (System.currentTimeMillis() < y3Var.f30558c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        z3 z3Var;
        Throwable th2;
        Boolean bool;
        e().C();
        k0();
        this.f30625w = true;
        try {
            l1 l1Var = this.f30615m;
            l1Var.getClass();
            bool = l1Var.n().f30068f;
        } catch (Throwable th3) {
            th = th3;
            z3Var = this;
        }
        try {
            if (bool == null) {
                b().f30413j.f("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                b().f30411g.f("Upload called in the client side when service should be used");
            } else if (this.f30618p > 0) {
                N();
            } else {
                v0 v0Var = this.f30606c;
                T(v0Var);
                if (v0Var.W()) {
                    n nVar = this.f30607d;
                    T(nVar);
                    if (nVar.I(str)) {
                        n nVar2 = this.f30607d;
                        T(nVar2);
                        pa.c0.f(str);
                        nVar2.C();
                        nVar2.D();
                        List listH = nVar2.H(str, s3.a(q2.GOOGLE_SIGNAL), 1);
                        a4 a4Var = listH.isEmpty() ? null : (a4) listH.get(0);
                        if (a4Var != null) {
                            com.google.android.gms.internal.measurement.j3 j3Var = a4Var.f29938b;
                            b().f30418o.i("[sgtm] Uploading data from upload queue. appId, type, url", str, a4Var.f29941e, a4Var.f29939c);
                            byte[] bArrA = j3Var.a();
                            if (Log.isLoggable(b().M(), 2)) {
                                v0 v0Var2 = this.f30611h;
                                T(v0Var2);
                                b().f30418o.i("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), v0Var2.f0(j3Var));
                            }
                            v3 v3Var = new v3(a4Var.f29939c, a4Var.f29940d, a4Var.f29941e, null);
                            this.f30624v = true;
                            v0 v0Var3 = this.f30606c;
                            T(v0Var3);
                            z3Var = this;
                            try {
                                v0Var3.b0(str, v3Var, j3Var, new ka.k(21, z3Var, str, a4Var, false));
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                z3Var.f30625w = false;
                                O();
                                throw th2;
                            }
                        }
                        z3Var.f30625w = false;
                        O();
                    }
                    b().f30418o.g(str, "[sgtm] Upload queue has no batches for appId");
                } else {
                    b().f30418o.f("Network not connected, ignoring upload request");
                    N();
                }
            }
            z3Var = this;
            z3Var.f30625w = false;
            O();
        } catch (Throwable th5) {
            th2 = th5;
            z3Var = this;
            z3Var.f30625w = false;
            O();
            throw th2;
        }
    }

    public final void u(String str, boolean z5, Long l10, Long l11) {
        n nVar = this.f30607d;
        T(nVar);
        w0 w0VarE0 = nVar.E0(str);
        if (w0VarE0 != null) {
            l1 l1Var = w0VarE0.f30468a;
            i1 i1Var = l1Var.f30266h;
            l1.k(i1Var);
            i1Var.C();
            w0VarE0.Q |= w0VarE0.f30491y != z5;
            w0VarE0.f30491y = z5;
            i1 i1Var2 = l1Var.f30266h;
            l1.k(i1Var2);
            i1Var2.C();
            w0VarE0.Q |= !Objects.equals(w0VarE0.f30492z, l10);
            w0VarE0.f30492z = l10;
            i1 i1Var3 = l1Var.f30266h;
            l1.k(i1Var3);
            i1Var3.C();
            w0VarE0.Q |= !Objects.equals(w0VarE0.A, l11);
            w0VarE0.A = l11;
            if (w0VarE0.o()) {
                n nVar2 = this.f30607d;
                T(nVar2);
                nVar2.F0(w0VarE0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(com.google.android.gms.internal.measurement.k3 r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.v(com.google.android.gms.internal.measurement.k3, java.lang.String):void");
    }

    public final void w(com.google.android.gms.internal.measurement.k3 k3Var, oq oqVar) {
        String strT0;
        String strT02;
        for (int i = 0; i < k3Var.V(); i++) {
            com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).T1(i).i();
            Iterator it = c3Var.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.g3) it.next()).q())) {
                    if (((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).G0() >= d0().K(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), d0.f30028l0)) {
                        int iK = d0().K(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), d0.f30053y0);
                        LinkedList linkedList = this.f30620r;
                        v0 v0Var = this.f30611h;
                        if (iK > 0) {
                            n nVar = this.f30607d;
                            T(nVar);
                            if (nVar.G0(c(), ((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), false, false, false, true).f30206g > iK) {
                                com.google.android.gms.internal.measurement.f3 f3VarB = com.google.android.gms.internal.measurement.g3.B();
                                f3VarB.h("_tnr");
                                f3VarB.j(1L);
                                c3Var.k((com.google.android.gms.internal.measurement.g3) f3VarB.e());
                            } else {
                                if (d0().M(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), d0.R0)) {
                                    strT02 = j0().t0();
                                    com.google.android.gms.internal.measurement.f3 f3VarB2 = com.google.android.gms.internal.measurement.g3.B();
                                    f3VarB2.h("_tu");
                                    f3VarB2.i(strT02);
                                    c3Var.k((com.google.android.gms.internal.measurement.g3) f3VarB2.e());
                                } else {
                                    strT02 = null;
                                }
                                com.google.android.gms.internal.measurement.f3 f3VarB3 = com.google.android.gms.internal.measurement.g3.B();
                                f3VarB3.h("_tr");
                                f3VarB3.j(1L);
                                c3Var.k((com.google.android.gms.internal.measurement.g3) f3VarB3.e());
                                T(v0Var);
                                o3 o3VarD0 = v0Var.d0(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), k3Var, c3Var, strT02);
                                if (o3VarD0 != null) {
                                    b().f30418o.h(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), "Generated trigger URI. appId, uri", o3VarD0.f30330b);
                                    n nVar2 = this.f30607d;
                                    T(nVar2);
                                    nVar2.W(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), o3VarD0);
                                    if (!linkedList.contains(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p())) {
                                        linkedList.add(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p());
                                    }
                                }
                            }
                        } else {
                            if (d0().M(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), d0.R0)) {
                                strT0 = j0().t0();
                                com.google.android.gms.internal.measurement.f3 f3VarB4 = com.google.android.gms.internal.measurement.g3.B();
                                f3VarB4.h("_tu");
                                f3VarB4.i(strT0);
                                c3Var.k((com.google.android.gms.internal.measurement.g3) f3VarB4.e());
                            } else {
                                strT0 = null;
                            }
                            com.google.android.gms.internal.measurement.f3 f3VarB5 = com.google.android.gms.internal.measurement.g3.B();
                            f3VarB5.h("_tr");
                            f3VarB5.j(1L);
                            c3Var.k((com.google.android.gms.internal.measurement.g3) f3VarB5.e());
                            T(v0Var);
                            o3 o3VarD02 = v0Var.d0(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), k3Var, c3Var, strT0);
                            if (o3VarD02 != null) {
                                b().f30418o.h(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), "Generated trigger URI. appId, uri", o3VarD02.f30330b);
                                n nVar3 = this.f30607d;
                                T(nVar3);
                                nVar3.W(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p(), o3VarD02);
                                if (!linkedList.contains(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p())) {
                                    linkedList.add(((com.google.android.gms.internal.measurement.l3) oqVar.f8754b).p());
                                }
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) c3Var.e();
                    k3Var.b();
                    ((com.google.android.gms.internal.measurement.l3) k3Var.f13840c).X(i, d3Var);
                }
            }
        }
    }

    public final void x(String str, com.google.android.gms.internal.measurement.f3 f3Var, Bundle bundle, String str2) {
        int iMax;
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (e4.Z(((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).q()) || e4.Z(str)) {
            g gVarD0 = d0();
            gVarD0.getClass();
            iMax = Math.max(Math.max(Math.min(gVarD0.K(str2, d0.h0), 500), 100), 256);
        } else {
            g gVarD02 = d0();
            gVarD02.getClass();
            iMax = Math.max(Math.min(gVarD02.K(str2, d0.h0), 500), 100);
        }
        long j10 = iMax;
        long jCodePointCount = ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).s().codePointCount(0, ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).s().length());
        j0();
        String strQ = ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).q();
        d0();
        String strH = e4.H(40, strQ, true);
        if (jCodePointCount <= j10 || listUnmodifiableList.contains(((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).q())) {
            return;
        }
        if ("_ev".equals(((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).q())) {
            j0();
            String strS = ((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).s();
            g gVarD03 = d0();
            gVarD03.getClass();
            bundle.putString("_ev", e4.H(Math.max(Math.max(Math.min(gVarD03.K(str2, d0.h0), 500), 100), 256), strS, true));
            return;
        }
        b().f30415l.h(strH, "Param value is too long; discarded. Name, value length", Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strH);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((com.google.android.gms.internal.measurement.g3) f3Var.f13840c).q());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0153 A[EDGE_INSN: B:106:0x0153->B:52:0x0153 BREAK  A[LOOP:0: B:33:0x00f5->B:108:0x00f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x0018, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:81:0x021e, B:83:0x0231, B:85:0x023c, B:93:0x025b, B:87:0x0242, B:89:0x024b, B:91:0x0251, B:92:0x0255, B:94:0x025e, B:95:0x0266, B:30:0x00d9, B:96:0x0267), top: B:105:0x0015, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[Catch: all -> 0x0018, PHI: r0
      0x008f: PHI (r0v2 int) = (r0v0 int), (r0v35 int) binds: [B:9:0x0025, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:81:0x021e, B:83:0x0231, B:85:0x023c, B:93:0x025b, B:87:0x0242, B:89:0x024b, B:91:0x0251, B:92:0x0255, B:94:0x025e, B:95:0x0266, B:30:0x00d9, B:96:0x0267), top: B:105:0x0015, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:81:0x021e, B:83:0x0231, B:85:0x023c, B:93:0x025b, B:87:0x0242, B:89:0x024b, B:91:0x0251, B:92:0x0255, B:94:0x025e, B:95:0x0266, B:30:0x00d9), top: B:102:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:81:0x021e, B:83:0x0231, B:85:0x023c, B:93:0x025b, B:87:0x0242, B:89:0x024b, B:91:0x0251, B:92:0x0255, B:94:0x025e, B:95:0x0266, B:30:0x00d9), top: B:102:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff A[Catch: all -> 0x0150, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:68:0x01ef, B:70:0x01f5, B:71:0x01fc, B:74:0x020a, B:76:0x020e, B:79:0x0215, B:80:0x0216), top: B:101:0x00ec, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:68:0x01ef, B:70:0x01f5, B:71:0x01fc, B:74:0x020a, B:76:0x020e, B:79:0x0215, B:80:0x0216), top: B:101:0x00ec, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8 A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:68:0x01ef, B:70:0x01f5, B:71:0x01fc, B:74:0x020a, B:76:0x020e, B:79:0x0215, B:80:0x0216), top: B:101:0x00ec, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f5 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #0 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:68:0x01ef, B:70:0x01f5, B:71:0x01fc, B:74:0x020a, B:76:0x020e, B:79:0x0215, B:80:0x0216), top: B:101:0x00ec, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0231 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:81:0x021e, B:83:0x0231, B:85:0x023c, B:93:0x025b, B:87:0x0242, B:89:0x024b, B:91:0x0251, B:92:0x0255, B:94:0x025e, B:95:0x0266, B:30:0x00d9), top: B:102:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0242 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:81:0x021e, B:83:0x0231, B:85:0x023c, B:93:0x025b, B:87:0x0242, B:89:0x024b, B:91:0x0251, B:92:0x0255, B:94:0x025e, B:95:0x0266, B:30:0x00d9), top: B:102:0x00a4, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(boolean r18, int r19, java.lang.Throwable r20, byte[] r21, java.lang.String r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.z3.y(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final void z(w0 w0Var) {
        h1.e eVar;
        h1.e eVar2;
        e().C();
        if (TextUtils.isEmpty(w0Var.G())) {
            String strD = w0Var.D();
            pa.c0.i(strD);
            A(strD, 204, null, null, null);
            return;
        }
        String strD2 = w0Var.D();
        pa.c0.i(strD2);
        b().f30418o.g(strD2, "Fetching remote configuration");
        e1 e1Var = this.f30605b;
        T(e1Var);
        com.google.android.gms.internal.measurement.h2 h2VarO = e1Var.O(strD2);
        T(e1Var);
        e1Var.C();
        String str = (String) e1Var.f30091n.get(strD2);
        if (h2VarO != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new h1.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            T(e1Var);
            e1Var.C();
            String str2 = (String) e1Var.f30092o.get(strD2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new h1.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.f30623u = true;
        v0 v0Var = this.f30606c;
        T(v0Var);
        m7.a aVar = new m7.a(10, this);
        l1 l1Var = (l1) v0Var.f15951b;
        v0Var.C();
        v0Var.D();
        w3 w3Var = v0Var.f30373c.f30613k;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) d0.f30011f.a(null)).encodedAuthority((String) d0.f30014g.a(null)).path("config/app/".concat(String.valueOf(w0Var.G()))).appendQueryParameter("platform", "android");
        ((l1) w3Var.f15951b).f30263e.H();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", CommonUrlParts.Values.FALSE_INTEGER);
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            i1 i1Var = l1Var.f30266h;
            l1.k(i1Var);
            i1Var.O(new u0(v0Var, w0Var.D(), url, (byte[]) null, eVar, aVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.h(s0.K(w0Var.D()), "Failed to parse config URL. Not fetching. appId", string);
        }
    }
}
