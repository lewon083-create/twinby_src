package k0;

import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.l0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;
import ob.a1;
import ob.d3;
import ob.k2;
import ob.r2;
import ob.z3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f26776d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.f26774b = i;
        this.f26775c = obj;
        this.f26776d = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:24|(1:26)(26:29|301|30|31|(1:34)(22:36|(1:38)|309|39|(7:41|(1:43)(1:45)|305|46|297|47|48)|28|52|(2:54|(2:56|(2:58|(2:60|(2:62|(2:64|(1:66)(1:67))(1:68))(1:69))(1:70))(1:71))(1:72))(1:73)|74|299|75|(1:77)(1:78)|79|(1:81)|85|(1:87)(7:89|(0)(1:92)|(3:303|94|(1:96)(1:97))|(2:103|(1:105)(4:106|(3:109|(1:315)(1:316)|107)|314|112))(1:112)|(1:114)(1:115)|116|(30:118|(1:120)(1:121)|122|(1:124)|125|(1:127)(1:128)|129|(2:131|(2:136|(1:138))(1:(3:135|136|(0))))(0)|139|(20:144|(1:146)|147|(1:163)(1:164)|165|(1:167)|168|(2:173|(2:179|(2:186|(2:187|(1:311)(2:189|(2:312|191)(1:313))))(0))(1:178))(1:172)|192|(3:196|(1:198)|199)|200|(1:202)|203|(1:207)|208|(3:210|(7:212|(1:214)(1:215)|216|(1:218)|219|(4:223|(1:225)|226|(1:228))|229)(1:231)|230)(10:232|(2:234|(2:247|248)(3:237|(5:239|(1:241)(1:242)|243|(1:245)|246)(0)|248))(1:249)|250|(1:252)|253|307|254|255|259|(5:261|(1:263)(1:264)|(1:268)|(1:270)|271))|272|(3:274|(1:276)(1:277)|(5:279|(1:281)|282|(1:284)|285))|286|287)(1:143)|148|(1:(1:159)(19:158|147|(0)(0)|165|(0)|168|(3:170|173|(3:176|179|(4:182|184|186|(3:187|(0)(0)|313))(0))(0))(0)|192|(4:194|196|(0)|199)(0)|200|(0)|203|(2:205|207)|208|(0)(0)|272|(0)|286|287))(1:161)|160|(0)(0)|165|(0)|168|(0)(0)|192|(0)(0)|200|(0)|203|(0)|208|(0)(0)|272|(0)|286|287)(2:288|289))|88|(0)|(0)(0)|(0)(0)|116|(0)(0))|35|309|39|(0)(0)|28|52|(0)(0)|74|299|75|(0)(0)|79|(0)|85|(0)(0)|88|(0)|(0)(0)|(0)(0)|116|(0)(0))|27|28|52|(0)(0)|74|299|75|(0)(0)|79|(0)|85|(0)(0)|88|(0)|(0)(0)|(0)(0)|116|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:29|(2:301|30)|31|(1:34)(22:36|(1:38)|309|39|(7:41|(1:43)(1:45)|305|46|297|47|48)|28|52|(2:54|(2:56|(2:58|(2:60|(2:62|(2:64|(1:66)(1:67))(1:68))(1:69))(1:70))(1:71))(1:72))(1:73)|74|299|75|(1:77)(1:78)|79|(1:81)|85|(1:87)(7:89|(0)(1:92)|(3:303|94|(1:96)(1:97))|(2:103|(1:105)(4:106|(3:109|(1:315)(1:316)|107)|314|112))(1:112)|(1:114)(1:115)|116|(30:118|(1:120)(1:121)|122|(1:124)|125|(1:127)(1:128)|129|(2:131|(2:136|(1:138))(1:(3:135|136|(0))))(0)|139|(20:144|(1:146)|147|(1:163)(1:164)|165|(1:167)|168|(2:173|(2:179|(2:186|(2:187|(1:311)(2:189|(2:312|191)(1:313))))(0))(1:178))(1:172)|192|(3:196|(1:198)|199)|200|(1:202)|203|(1:207)|208|(3:210|(7:212|(1:214)(1:215)|216|(1:218)|219|(4:223|(1:225)|226|(1:228))|229)(1:231)|230)(10:232|(2:234|(2:247|248)(3:237|(5:239|(1:241)(1:242)|243|(1:245)|246)(0)|248))(1:249)|250|(1:252)|253|307|254|255|259|(5:261|(1:263)(1:264)|(1:268)|(1:270)|271))|272|(3:274|(1:276)(1:277)|(5:279|(1:281)|282|(1:284)|285))|286|287)(1:143)|148|(1:(1:159)(19:158|147|(0)(0)|165|(0)|168|(3:170|173|(3:176|179|(4:182|184|186|(3:187|(0)(0)|313))(0))(0))(0)|192|(4:194|196|(0)|199)(0)|200|(0)|203|(2:205|207)|208|(0)(0)|272|(0)|286|287))(1:161)|160|(0)(0)|165|(0)|168|(0)(0)|192|(0)(0)|200|(0)|203|(0)|208|(0)(0)|272|(0)|286|287)(2:288|289))|88|(0)|(0)(0)|(0)(0)|116|(0)(0))|35|309|39|(0)(0)|28|52|(0)(0)|74|299|75|(0)(0)|79|(0)|85|(0)(0)|88|(0)|(0)(0)|(0)(0)|116|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01bc, code lost:
    
        r5 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x027f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0280, code lost:
    
        ob.l1.k(r13);
        r13.f30411g.h(ob.s0.K(r14), "Fetching Google App Id failed with exception. appId", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x02c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05a0 A[EDGE_INSN: B:311:0x05a0->B:192:0x05a0 BREAK  A[LOOP:0: B:187:0x058b->B:313:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019f A[Catch: NameNotFoundException -> 0x01bc, TryCatch #6 {NameNotFoundException -> 0x01bc, blocks: (B:39:0x0194, B:41:0x019f, B:43:0x01ab), top: B:309:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0270 A[Catch: IllegalStateException -> 0x027f, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x027f, blocks: (B:75:0x025e, B:79:0x026c, B:81:0x0270), top: B:299:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b0  */
    /* JADX WARN: Type inference failed for: r0v48, types: [ob.j2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.i.a():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0205  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.i.run():void");
    }

    public String toString() {
        switch (this.f26774b) {
            case 0:
                return i.class.getSimpleName() + StringUtils.COMMA + ((c) this.f26776d);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(int i, Object obj, Object obj2, boolean z5) {
        this.f26774b = i;
        this.f26776d = obj;
        this.f26775c = obj2;
    }

    public i(ni.i iVar, z3 z3Var, Runnable runnable) {
        this.f26774b = 27;
        this.f26775c = z3Var;
        this.f26776d = runnable;
    }

    public i(a1 a1Var, b0 b0Var, a1 a1Var2) {
        this.f26774b = 20;
        this.f26775c = b0Var;
        this.f26776d = a1Var;
    }

    public i(k2 k2Var, l0 l0Var) {
        this.f26774b = 22;
        this.f26775c = l0Var;
        Objects.requireNonNull(k2Var);
        this.f26776d = k2Var;
    }

    public i(d3 d3Var, r2 r2Var) {
        this.f26774b = 24;
        this.f26775c = r2Var;
        Objects.requireNonNull(d3Var);
        this.f26776d = d3Var;
    }
}
