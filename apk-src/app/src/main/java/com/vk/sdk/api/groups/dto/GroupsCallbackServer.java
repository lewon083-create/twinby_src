package com.vk.sdk.api.groups.dto;

import a0.u;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class GroupsCallbackServer {

    @b("creator_id")
    private final int creatorId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15173id;

    @b("secret_key")
    @NotNull
    private final String secretKey;

    @b("status")
    @NotNull
    private final Status status;

    @b("title")
    @NotNull
    private final String title;

    @b("url")
    @NotNull
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Status {
        UNCONFIGURED("unconfigured"),
        FAILED("failed"),
        WAIT("wait"),
        OK("ok");


        @NotNull
        private final String value;

        Status(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public GroupsCallbackServer(int i, @NotNull String title, int i10, @NotNull String url, @NotNull String secretKey, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f15173id = i;
        this.title = title;
        this.creatorId = i10;
        this.url = url;
        this.secretKey = secretKey;
        this.status = status;
    }

    public static /* synthetic */ GroupsCallbackServer copy$default(GroupsCallbackServer groupsCallbackServer, int i, String str, int i10, String str2, String str3, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = groupsCallbackServer.f15173id;
        }
        if ((i11 & 2) != 0) {
            str = groupsCallbackServer.title;
        }
        if ((i11 & 4) != 0) {
            i10 = groupsCallbackServer.creatorId;
        }
        if ((i11 & 8) != 0) {
            str2 = groupsCallbackServer.url;
        }
        if ((i11 & 16) != 0) {
            str3 = groupsCallbackServer.secretKey;
        }
        if ((i11 & 32) != 0) {
            status = groupsCallbackServer.status;
        }
        String str4 = str3;
        Status status2 = status;
        return groupsCallbackServer.copy(i, str, i10, str2, str4, status2);
    }

    public final int component1() {
        return this.f15173id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.creatorId;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final String component5() {
        return this.secretKey;
    }

    @NotNull
    public final Status component6() {
        return this.status;
    }

    @NotNull
    public final GroupsCallbackServer copy(int i, @NotNull String title, int i10, @NotNull String url, @NotNull String secretKey, @NotNull Status status) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(status, "status");
        return new GroupsCallbackServer(i, title, i10, url, secretKey, status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsCallbackServer)) {
            return false;
        }
        GroupsCallbackServer groupsCallbackServer = (GroupsCallbackServer) obj;
        return this.f15173id == groupsCallbackServer.f15173id && Intrinsics.a(this.title, groupsCallbackServer.title) && this.creatorId == groupsCallbackServer.creatorId && Intrinsics.a(this.url, groupsCallbackServer.url) && Intrinsics.a(this.secretKey, groupsCallbackServer.secretKey) && this.status == groupsCallbackServer.status;
    }

    public final int getCreatorId() {
        return this.creatorId;
    }

    public final int getId() {
        return this.f15173id;
    }

    @NotNull
    public final String getSecretKey() {
        return this.secretKey;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.status.hashCode() + a.e(a.e(u.g(this.creatorId, a.e(Integer.hashCode(this.f15173id) * 31, 31, this.title), 31), 31, this.url), 31, this.secretKey);
    }

    @NotNull
    public String toString() {
        int i = this.f15173id;
        String str = this.title;
        int i10 = this.creatorId;
        String str2 = this.url;
        String str3 = this.secretKey;
        Status status = this.status;
        StringBuilder sbI = pe.a.i(i, "GroupsCallbackServer(id=", ", title=", str, ", creatorId=");
        a.q(i10, ", url=", str2, ", secretKey=", sbI);
        sbI.append(str3);
        sbI.append(", status=");
        sbI.append(status);
        sbI.append(")");
        return sbI.toString();
    }
}
