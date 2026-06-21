package com.vk.sdk.api.account.dto;

import a0.u;
import com.vk.api.sdk.exceptions.VKApiCodes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class AccountNameRequest {

    @b("first_name")
    @Nullable
    private final String firstName;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15106id;

    @b(VKApiCodes.PARAM_LANG)
    @Nullable
    private final String lang;

    @b("last_name")
    @Nullable
    private final String lastName;

    @b("link_href")
    @Nullable
    private final String linkHref;

    @b("link_label")
    @Nullable
    private final String linkLabel;

    @b("status")
    @Nullable
    private final AccountNameRequestStatus status;

    public AccountNameRequest() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ AccountNameRequest copy$default(AccountNameRequest accountNameRequest, String str, Integer num, String str2, AccountNameRequestStatus accountNameRequestStatus, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountNameRequest.firstName;
        }
        if ((i & 2) != 0) {
            num = accountNameRequest.f15106id;
        }
        if ((i & 4) != 0) {
            str2 = accountNameRequest.lastName;
        }
        if ((i & 8) != 0) {
            accountNameRequestStatus = accountNameRequest.status;
        }
        if ((i & 16) != 0) {
            str3 = accountNameRequest.lang;
        }
        if ((i & 32) != 0) {
            str4 = accountNameRequest.linkHref;
        }
        if ((i & 64) != 0) {
            str5 = accountNameRequest.linkLabel;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        String str9 = str2;
        return accountNameRequest.copy(str, num, str9, accountNameRequestStatus, str8, str6, str7);
    }

    @Nullable
    public final String component1() {
        return this.firstName;
    }

    @Nullable
    public final Integer component2() {
        return this.f15106id;
    }

    @Nullable
    public final String component3() {
        return this.lastName;
    }

    @Nullable
    public final AccountNameRequestStatus component4() {
        return this.status;
    }

    @Nullable
    public final String component5() {
        return this.lang;
    }

    @Nullable
    public final String component6() {
        return this.linkHref;
    }

    @Nullable
    public final String component7() {
        return this.linkLabel;
    }

    @NotNull
    public final AccountNameRequest copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable AccountNameRequestStatus accountNameRequestStatus, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new AccountNameRequest(str, num, str2, accountNameRequestStatus, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountNameRequest)) {
            return false;
        }
        AccountNameRequest accountNameRequest = (AccountNameRequest) obj;
        return Intrinsics.a(this.firstName, accountNameRequest.firstName) && Intrinsics.a(this.f15106id, accountNameRequest.f15106id) && Intrinsics.a(this.lastName, accountNameRequest.lastName) && this.status == accountNameRequest.status && Intrinsics.a(this.lang, accountNameRequest.lang) && Intrinsics.a(this.linkHref, accountNameRequest.linkHref) && Intrinsics.a(this.linkLabel, accountNameRequest.linkLabel);
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final Integer getId() {
        return this.f15106id;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getLinkHref() {
        return this.linkHref;
    }

    @Nullable
    public final String getLinkLabel() {
        return this.linkLabel;
    }

    @Nullable
    public final AccountNameRequestStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f15106id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AccountNameRequestStatus accountNameRequestStatus = this.status;
        int iHashCode4 = (iHashCode3 + (accountNameRequestStatus == null ? 0 : accountNameRequestStatus.hashCode())) * 31;
        String str3 = this.lang;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkHref;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkLabel;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.firstName;
        Integer num = this.f15106id;
        String str2 = this.lastName;
        AccountNameRequestStatus accountNameRequestStatus = this.status;
        String str3 = this.lang;
        String str4 = this.linkHref;
        String str5 = this.linkLabel;
        StringBuilder sb2 = new StringBuilder("AccountNameRequest(firstName=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(num);
        sb2.append(", lastName=");
        sb2.append(str2);
        sb2.append(", status=");
        sb2.append(accountNameRequestStatus);
        sb2.append(", lang=");
        o.t(sb2, str3, ", linkHref=", str4, ", linkLabel=");
        return u.o(sb2, str5, ")");
    }

    public AccountNameRequest(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable AccountNameRequestStatus accountNameRequestStatus, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.firstName = str;
        this.f15106id = num;
        this.lastName = str2;
        this.status = accountNameRequestStatus;
        this.lang = str3;
        this.linkHref = str4;
        this.linkLabel = str5;
    }

    public /* synthetic */ AccountNameRequest(String str, Integer num, String str2, AccountNameRequestStatus accountNameRequestStatus, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : accountNameRequestStatus, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
