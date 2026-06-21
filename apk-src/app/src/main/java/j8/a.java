package j8;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import ei.b;
import hi.g;
import ii.n;
import ii.o;
import ii.p;
import ii.q;
import io.appmetrica.analytics.impl.cp;
import k8.c;
import k8.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class a implements b, o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f26576d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f26577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f26578c;

    public a() {
        SparseArray sparseArray = n8.a.f29173a;
        n8.a.a(new p8.a(0));
        n8.a.a(new p8.a(1));
        n8.a.a(new q8.a());
        n8.a.a(new p8.a(3));
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f26577b = binding.f16381a;
        q qVar = new q(binding.f16383c, "flutter_image_compress");
        this.f26578c = qVar;
        qVar.b(this);
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        q qVar = this.f26578c;
        if (qVar != null) {
            qVar.b(null);
        }
        this.f26578c = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ii.o
    public final void onMethodCall(n call, p result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.f21315a;
        switch (str.hashCode()) {
            case -129880033:
                if (str.equals("compressWithFileAndGetFile")) {
                    final k8.b bVar = new k8.b(call, (g) result);
                    final Context context = this.f26577b;
                    if (context == null) {
                        Intrinsics.g("context");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(context, "context");
                    final int i = 1;
                    d.f27245d.execute(new Runnable() { // from class: k8.a
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
                        /* JADX WARN: Type inference failed for: r0v9, types: [byte[], java.io.Serializable] */
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
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 572
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: k8.a.run():void");
                        }
                    });
                    return;
                }
                break;
            case 86054116:
                if (str.equals("compressWithFile")) {
                    final k8.b bVar2 = new k8.b(call, (g) result);
                    final Context context2 = this.f26577b;
                    if (context2 == null) {
                        Intrinsics.g("context");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(context2, "context");
                    final int i10 = 0;
                    d.f27245d.execute(new Runnable() { // from class: k8.a
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
                        /* JADX WARN: Type inference failed for: r0v9, types: [byte[], java.io.Serializable] */
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
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 572
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: k8.a.run():void");
                        }
                    });
                    return;
                }
                break;
            case 86233094:
                if (str.equals("compressWithList")) {
                    c cVar = new c(call, (g) result);
                    Context context3 = this.f26577b;
                    if (context3 == null) {
                        Intrinsics.g("context");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(context3, "context");
                    d.f27245d.execute(new cp(23, cVar, context3));
                    return;
                }
                break;
            case 1262746611:
                if (str.equals("getSystemVersion")) {
                    ((g) result).success(Integer.valueOf(Build.VERSION.SDK_INT));
                    return;
                }
                break;
            case 2067272455:
                if (str.equals("showLog")) {
                    f26576d = Intrinsics.a((Boolean) call.f21316b, Boolean.TRUE);
                    ((g) result).success(1);
                    return;
                }
                break;
        }
        ((g) result).a();
    }
}
