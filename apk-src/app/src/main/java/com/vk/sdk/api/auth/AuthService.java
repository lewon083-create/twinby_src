package com.vk.sdk.api.auth;

import com.vk.api.sdk.requests.VKRequest;
import com.vk.sdk.api.GsonHolder;
import com.vk.sdk.api.NewApiRequest;
import com.vk.sdk.api.auth.dto.AuthRestoreResponse;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.p;
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
public final class AuthService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: authRestore$lambda-0, reason: not valid java name */
    public static final AuthRestoreResponse m121authRestore$lambda0(p it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (AuthRestoreResponse) GsonHolder.INSTANCE.getGson().b(it, AuthRestoreResponse.class);
    }

    @NotNull
    public final VKRequest<AuthRestoreResponse> authRestore(@NotNull String phone, @NotNull String lastName) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        NewApiRequest newApiRequest = new NewApiRequest("auth.restore", new a(24));
        newApiRequest.addParam("phone", phone);
        newApiRequest.addParam("last_name", lastName);
        return newApiRequest;
    }
}
