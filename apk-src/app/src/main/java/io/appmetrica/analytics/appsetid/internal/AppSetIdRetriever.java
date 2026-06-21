package io.appmetrica.analytics.appsetid.internal;

import a1.e;
import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ga.b;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21495a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f21496b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i) {
        appSetIdRetriever.getClass();
        return i != 1 ? i != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(@NotNull Context context, @NotNull final AppSetIdListener appSetIdListener) {
        Task taskB = new e(context).b();
        OnCompleteListener<b> onCompleteListener = new OnCompleteListener<b>() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NotNull Task<b> task) {
                Object obj = this.f21497a.f21495a;
                AppSetIdRetriever appSetIdRetriever = this.f21497a;
                synchronized (obj) {
                    appSetIdRetriever.f21496b.remove(this);
                }
                if (task.isSuccessful()) {
                    appSetIdListener.onAppSetIdRetrieved(task.getResult().f20059a, AppSetIdRetriever.access$convertScope(this.f21497a, task.getResult().f20060b));
                } else {
                    appSetIdListener.onFailure(task.getException());
                }
            }
        };
        synchronized (this.f21495a) {
            this.f21496b.add(onCompleteListener);
        }
        taskB.addOnCompleteListener(onCompleteListener);
    }
}
