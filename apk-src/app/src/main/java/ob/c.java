package ob;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends u3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashSet f29972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h1.e f29973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f29974h;
    public Long i;

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:3|(2:5|(2:532|7)(1:533))(2:531|8))|9|(3:11|471|12)|16|(11:(1:69)(9:19|525|20|489|21|(16:23|(9:24|498|25|491|26|27|(1:29)(3:30|(3:32|523|33)(1:38)|39)|46|(1:534)(1:49))|48|70|529|71|480|72|(2:74|75)(4:83|84|(8:85|473|86|515|87|88|99|(1:605)(1:102))|101)|479|119|(1:121)(6:123|(14:125|513|126|127|527|128|482|129|(1:(4:131|(1:133)|134|139))(1:142)|141|156|(3:159|(3:162|(6:592|166|185|183|596|594)(2:167|(11:593|169|(4:172|(2:174|598)(1:599)|175|170)|597|176|(4:179|(3:601|181|604)(1:603)|602|177)|600|182|183|596|594)(4:590|184|595|594))|160)|589)|158|186)(1:190)|191|(12:194|(3:199|(4:202|(5:572|204|(1:206)(1:207)|208|575)(1:574)|573|200)|571)|198|209|(3:214|(4:217|(1:581)(3:578|221|582)|579|215)|576)|213|(3:223|(6:226|(3:228|(2:230|585)|233)(1:231)|232|584|233|224)|583)|234|(3:244|(8:247|(1:249)|250|(1:252)|253|(2:255|587)(1:588)|256|245)|586)|243|257|192)|570|258)|122|259|(3:262|(4:265|(3:536|267|(6:537|269|(7:271|517|272|475|273|(3:275|(11:276|487|277|485|278|279|280|(3:282|519|283)(1:288)|289|296|(1:542)(1:299))|298)(3:300|301|302)|316)(1:322)|323|(4:326|(3:544|328|547)(6:543|329|(2:330|(5:332|(1:334)(1:336)|335|337|(1:339)(2:548|340))(2:549|341))|(1:343)|344|546)|545|324)|541)(1:540))(1:539)|538|263)|535)|(6:346|(3:349|(6:352|(7:354|521|355|469|356|(3:358|(11:359|483|360|508|361|362|363|(3:365|506|366)(1:371)|372|379|(1:553)(1:382))|381)(3:385|386|387)|401)(1:406)|407|(2:408|(2:410|(3:554|412|551)(4:414|(2:415|(4:417|(4:419|(1:421)(1:423)|422|424)(1:425)|426|(1:559)(4:431|(1:433)(1:434)|435|(1:437)(2:560|438)))(2:557|444))|(2:446|555)(1:556)|447))(0))|413|350)|550)|448|(10:451|477|452|453|509|454|563|(3:562|456|566)(1:565)|564|449)|561|463)(2:464|465))(1:50)|52|(1:67)|68)|480|72|(0)(0)|479|119|(0)(0)|122|259|(0)|(0)(0))|51|70|529|71|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:0|2|(2:3|(2:5|(2:532|7)(1:533))(2:531|8))|9|(3:11|471|12)|16|(1:69)(9:19|525|20|489|21|(16:23|(9:24|498|25|491|26|27|(1:29)(3:30|(3:32|523|33)(1:38)|39)|46|(1:534)(1:49))|48|70|529|71|480|72|(2:74|75)(4:83|84|(8:85|473|86|515|87|88|99|(1:605)(1:102))|101)|479|119|(1:121)(6:123|(14:125|513|126|127|527|128|482|129|(1:(4:131|(1:133)|134|139))(1:142)|141|156|(3:159|(3:162|(6:592|166|185|183|596|594)(2:167|(11:593|169|(4:172|(2:174|598)(1:599)|175|170)|597|176|(4:179|(3:601|181|604)(1:603)|602|177)|600|182|183|596|594)(4:590|184|595|594))|160)|589)|158|186)(1:190)|191|(12:194|(3:199|(4:202|(5:572|204|(1:206)(1:207)|208|575)(1:574)|573|200)|571)|198|209|(3:214|(4:217|(1:581)(3:578|221|582)|579|215)|576)|213|(3:223|(6:226|(3:228|(2:230|585)|233)(1:231)|232|584|233|224)|583)|234|(3:244|(8:247|(1:249)|250|(1:252)|253|(2:255|587)(1:588)|256|245)|586)|243|257|192)|570|258)|122|259|(3:262|(4:265|(3:536|267|(6:537|269|(7:271|517|272|475|273|(3:275|(11:276|487|277|485|278|279|280|(3:282|519|283)(1:288)|289|296|(1:542)(1:299))|298)(3:300|301|302)|316)(1:322)|323|(4:326|(3:544|328|547)(6:543|329|(2:330|(5:332|(1:334)(1:336)|335|337|(1:339)(2:548|340))(2:549|341))|(1:343)|344|546)|545|324)|541)(1:540))(1:539)|538|263)|535)|(6:346|(3:349|(6:352|(7:354|521|355|469|356|(3:358|(11:359|483|360|508|361|362|363|(3:365|506|366)(1:371)|372|379|(1:553)(1:382))|381)(3:385|386|387)|401)(1:406)|407|(2:408|(2:410|(3:554|412|551)(4:414|(2:415|(4:417|(4:419|(1:421)(1:423)|422|424)(1:425)|426|(1:559)(4:431|(1:433)(1:434)|435|(1:437)(2:560|438)))(2:557|444))|(2:446|555)(1:556)|447))(0))|413|350)|550)|448|(10:451|477|452|453|509|454|563|(3:562|456|566)(1:565)|564|449)|561|463)(2:464|465))(1:50)|52|(1:67)|68)|51|70|529|71|480|72|(0)(0)|479|119|(0)(0)|122|259|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0251, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0252, code lost:
    
        r17 = r2;
        r19 = "Failed to merge filter. appId";
        r20 = "Database error querying filters. appId";
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025b, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x025e, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0a0a, code lost:
    
        r0 = r24.b().H();
        r2 = ob.s0.K(r40.f29971e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0a1c, code lost:
    
        if (r12.p() == false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0a1e, code lost:
    
        r7 = java.lang.Integer.valueOf(r12.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0a27, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0a28, code lost:
    
        r0.h(r2, "Invalid property filter ID. appId, id", java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e1, code lost:
    
        r17 = r2;
        r5 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:480:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:480:0x01cb }] */
    /* JADX WARN: Type inference failed for: r0v206 */
    /* JADX WARN: Type inference failed for: r0v207 */
    /* JADX WARN: Type inference failed for: r0v31, types: [h1.e, h1.i] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [h1.e, h1.i] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [ob.l1] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [ob.l1] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v38, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v39 */
    /* JADX WARN: Type inference failed for: r18v40 */
    /* JADX WARN: Type inference failed for: r18v41 */
    /* JADX WARN: Type inference failed for: r18v42 */
    /* JADX WARN: Type inference failed for: r18v43 */
    /* JADX WARN: Type inference failed for: r18v44 */
    /* JADX WARN: Type inference failed for: r18v45 */
    /* JADX WARN: Type inference failed for: r18v46 */
    /* JADX WARN: Type inference failed for: r18v47 */
    /* JADX WARN: Type inference failed for: r18v48 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r3v69, types: [com.google.android.gms.internal.ads.ur] */
    /* JADX WARN: Type inference failed for: r3v83, types: [com.google.android.gms.internal.ads.ur] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList G(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.c.G(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final i4 H(Integer num) {
        if (this.f29973g.containsKey(num)) {
            return (i4) this.f29973g.get(num);
        }
        i4 i4Var = new i4(this, this.f29971e);
        this.f29973g.put(num, i4Var);
        return i4Var;
    }

    @Override // ob.u3
    public final void F() {
    }
}
