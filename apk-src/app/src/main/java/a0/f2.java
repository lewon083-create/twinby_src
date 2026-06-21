package a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements f2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    public /* synthetic */ f2(int i) {
        this.f82a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v109 g0.a2, still in use, count: 2, list:
          (r2v109 g0.a2) from 0x009d: MOVE (r19v8 g0.a2) = (r2v109 g0.a2) (LINE:158)
          (r2v109 g0.a2) from 0x0092: MOVE (r19v12 g0.a2) = (r2v109 g0.a2) (LINE:147)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // f2.a
    public final void accept(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.f2.accept(java.lang.Object):void");
    }
}
