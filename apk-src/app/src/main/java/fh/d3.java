package fh;

import android.net.Uri;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Request;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d3 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sy f17051b;

    public /* synthetic */ d3(sy syVar, int i) {
        this.f17050a = i;
        this.f17051b = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        int i = this.f17050a;
        sy syVar = this.f17051b;
        switch (i) {
            case 0:
                b5 b5Var = (b5) entityTemplate;
                JSONObject jSONObject = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, b5Var.f16894b, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, e3.f17129a);
                JsonFieldResolver.resolveExpression(parsingContext, b5Var.f16895c, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
                Field field = b5Var.f16896d;
                TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
                Function1<Object, Uri> function1 = ParsingConvertersKt.ANY_TO_URI;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "log_url", typeHelper, function1);
                JsonFieldResolver.resolveOptionalList(parsingContext, b5Var.f16897e, jSONObject, "menu_items", syVar.f18493p1, syVar.f18473n1);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, b5Var.f16899g, jSONObject, "referer", typeHelper, function1);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, b5Var.i, jSONObject, "target", e3.f17130b, v0.f18721j);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, b5Var.f16902k, jSONObject, "url", typeHelper, function1);
                return new c1();
            case 1:
                a5 a5Var = (a5) entityTemplate;
                JSONObject jSONObject2 = (JSONObject) obj;
                Field field2 = a5Var.f16795a;
                ij.p pVar = syVar.f18464m1;
                ij.p pVar2 = syVar.f18443k1;
                JsonFieldResolver.resolveOptionalList(parsingContext, a5Var.f16796b, jSONObject2, "actions", syVar.f18464m1, pVar2);
                JsonFieldResolver.resolveExpression(parsingContext, a5Var.f16797c, jSONObject2, "text", TypeHelpersKt.TYPE_HELPER_STRING);
                return new g8.g(20);
            case 2:
                y4 y4Var = (y4) entityTemplate;
                JSONObject jSONObject3 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalList(parsingContext, y4Var.f19076a, jSONObject3, "headers", syVar.X0, syVar.V0);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, y4Var.f19077b, jSONObject3, Request.JsonKeys.METHOD, w4.f18823b, v0.f18727p, w4.f18822a);
                JsonFieldResolver.resolveExpression(parsingContext, y4Var.f19078c, jSONObject3, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
                return new s4();
            case 3:
                y6 y6Var = (y6) entityTemplate;
                JSONObject jSONObject4 = (JSONObject) obj;
                Field field3 = y6Var.f19080a;
                TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function12 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject4, "duration", typeHelper2, function12, x6.f18991f, x6.f18986a);
                Field field4 = y6Var.f19081b;
                TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
                Function1<Number, Double> function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject4, "end_value", typeHelper3, function13);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, y6Var.f19082c, jSONObject4, "interpolator", x6.f18989d, v0.f18737z, x6.f18987b);
                JsonFieldResolver.resolveOptionalList(parsingContext, y6Var.f19083d, jSONObject4, "items", syVar.f18522s1, syVar.f18503q1);
                JsonFieldResolver.resolveExpression(parsingContext, y6Var.f19084e, jSONObject4, "name", x6.f18990e, v0.f18735x);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, y6Var.f19086g, jSONObject4, "start_delay", typeHelper2, function12, x6.f18992g, x6.f18988c);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, y6Var.f19087h, jSONObject4, "start_value", typeHelper3, function13);
                return new u6();
            case 4:
                g8 g8Var = (g8) entityTemplate;
                JSONObject jSONObject5 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, g8Var.f17260a, jSONObject5, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, f8.f17182b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, g8Var.f17262c, jSONObject5, "has_shadow", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, f8.f17181a);
                return new e8();
            case 5:
                k9 k9Var = (k9) entityTemplate;
                JSONObject jSONObject6 = (JSONObject) obj;
                JsonFieldResolver.resolveExpression(parsingContext, k9Var.f17567a, jSONObject6, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
                JsonFieldResolver.resolveList(parsingContext, k9Var.f17569c, jSONObject6, "prototypes", syVar.f18422i2, syVar.f18400g2, j6.f17466g);
                return new h9();
            case 6:
                j9 j9Var = (j9) entityTemplate;
                JSONObject jSONObject7 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.f17483b, jSONObject7, "id", TypeHelpersKt.TYPE_HELPER_STRING);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, j9Var.f17484c, jSONObject7, "selector", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, i9.f17383a);
                return new g9();
            case 7:
                ca caVar = (ca) entityTemplate;
                JSONObject jSONObject8 = (JSONObject) obj;
                Field field5 = caVar.f17007b;
                TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
                Function1<Object, Boolean> function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject8, "show_at_end", typeHelper4, function14, ba.f16908a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, caVar.f17008c, jSONObject8, "show_at_start", typeHelper4, function14, ba.f16909b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, caVar.f17009d, jSONObject8, "show_between", typeHelper4, function14, ba.f16910c);
                return new u9();
            case 8:
                bb bbVar = (bb) entityTemplate;
                JSONObject jSONObject9 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalList(parsingContext, bbVar.f16911a, jSONObject9, "functions", syVar.J3, syVar.H3);
                JsonFieldResolver.resolveList(parsingContext, bbVar.f16913c, jSONObject9, "states", syVar.H2, syVar.F2, za.f19209c);
                JsonFieldResolver.resolveOptionalList(parsingContext, bbVar.f16914d, jSONObject9, "timers", syVar.E8, syVar.C8);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, bbVar.f16915e, jSONObject9, "transition_animation_selector", za.f19208b, kr.J, za.f19207a);
                JsonFieldResolver.resolveOptionalList(parsingContext, bbVar.f16916f, jSONObject9, "variable_triggers", syVar.W8, syVar.U8);
                JsonFieldResolver.resolveOptionalList(parsingContext, bbVar.f16917g, jSONObject9, "variables", syVar.c9, syVar.f18341a9);
                return new xa();
            case 9:
                ab abVar = (ab) entityTemplate;
                JSONObject jSONObject10 = (JSONObject) obj;
                ((Number) JsonFieldResolver.resolve(parsingContext, abVar.f16826b, jSONObject10, "state_id", ParsingConvertersKt.NUMBER_TO_INT)).longValue();
                return new nc.e();
            case 10:
                nb nbVar = (nb) entityTemplate;
                JSONObject jSONObject11 = (JSONObject) obj;
                Field field6 = nbVar.f17935a;
                TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
                m9 m9Var = mb.f17797e;
                Expression expression = mb.f17793a;
                Expression expressionResolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject11, "disappear_duration", typeHelper5, function15, m9Var, expression);
                Expression expression2 = expressionResolveOptionalExpression == null ? expression : expressionResolveOptionalExpression;
                Field field7 = nbVar.f17937c;
                TypeHelper<Boolean> typeHelper6 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
                Function1<Object, Boolean> function16 = ParsingConvertersKt.ANY_TO_BOOLEAN;
                Expression expression3 = mb.f17794b;
                Expression expressionResolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject11, "is_enabled", typeHelper6, function16, expression3);
                Expression expression4 = expressionResolveOptionalExpression2 == null ? expression3 : expressionResolveOptionalExpression2;
                Expression expressionResolveExpression = JsonFieldResolver.resolveExpression(parsingContext, nbVar.f17938d, jSONObject11, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
                Field field8 = nbVar.f17939e;
                m9 m9Var2 = mb.f17798f;
                Expression expression5 = mb.f17795c;
                Expression expressionResolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject11, "log_limit", typeHelper5, function15, m9Var2, expression5);
                Expression expression6 = expressionResolveOptionalExpression3 == null ? expression5 : expressionResolveOptionalExpression3;
                JSONObject jSONObject12 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, nbVar.f17940f, jSONObject11, "payload");
                Field field9 = nbVar.f17941g;
                TypeHelper<Uri> typeHelper7 = TypeHelpersKt.TYPE_HELPER_URI;
                Function1<Object, Uri> function17 = ParsingConvertersKt.ANY_TO_URI;
                Expression expressionResolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject11, "referer", typeHelper7, function17);
                Expression expressionResolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, nbVar.f17943j, jSONObject11, "url", typeHelper7, function17);
                Field field10 = nbVar.f17944k;
                m9 m9Var3 = mb.f17799g;
                Expression expression7 = mb.f17796d;
                Expression expressionResolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject11, "visibility_percentage", typeHelper5, function15, m9Var3, expression7);
                return new lb(expression2, expression4, expressionResolveExpression, expression6, expressionResolveOptionalExpression4, expressionResolveOptionalExpression5, expressionResolveOptionalExpression6 == null ? expression7 : expressionResolveOptionalExpression6, jSONObject12);
            case 11:
                pb pbVar = (pb) entityTemplate;
                JSONObject jSONObject13 = (JSONObject) obj;
                Field field11 = pbVar.f18088a;
                ij.p pVar3 = syVar.f18464m1;
                ij.p pVar4 = syVar.f18443k1;
                JsonFieldResolver.resolveOptionalList(parsingContext, field11, jSONObject13, "on_fail_actions", pVar3, pVar4);
                JsonFieldResolver.resolveOptionalList(parsingContext, pbVar.f18089b, jSONObject13, "on_success_actions", syVar.f18464m1, pVar4);
                return new ob();
            case 12:
                ld ldVar = (ld) entityTemplate;
                JSONObject jSONObject14 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalList(parsingContext, ldVar.f17686a, jSONObject14, A2.f22054g, syVar.H1, syVar.F1);
                Field field12 = ldVar.f17689d;
                ij.p pVar5 = syVar.f18464m1;
                ij.p pVar6 = syVar.f18443k1;
                JsonFieldResolver.resolveOptionalList(parsingContext, field12, jSONObject14, "on_blur", pVar5, pVar6);
                JsonFieldResolver.resolveOptionalList(parsingContext, ldVar.f17690e, jSONObject14, "on_focus", pVar5, pVar6);
                return new jd();
            case 13:
                pd pdVar = (pd) entityTemplate;
                JSONObject jSONObject15 = (JSONObject) obj;
                JsonFieldResolver.resolveList(parsingContext, pdVar.f18090a, jSONObject15, "arguments", syVar.G3, syVar.E3);
                return new wd.d();
            case 14:
                ok okVar = (ok) entityTemplate;
                JSONObject jSONObject16 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalList(parsingContext, okVar.f18039b, jSONObject16, "items", syVar.f18550u9, syVar.f18530s9);
                return new of();
            case 15:
                pk pkVar = (pk) entityTemplate;
                JSONObject jSONObject17 = (JSONObject) obj;
                JsonFieldResolver.resolveList(parsingContext, pkVar.f18101a, jSONObject17, "changes", syVar.B5, syVar.z5, nk.f17975c);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, pkVar.f18102b, jSONObject17, "mode", nk.f17974b, mg.B, nk.f17973a);
                Field field13 = pkVar.f18103c;
                ij.p pVar7 = syVar.f18464m1;
                ij.p pVar8 = syVar.f18443k1;
                JsonFieldResolver.resolveOptionalList(parsingContext, field13, jSONObject17, "on_applied_actions", pVar7, pVar8);
                JsonFieldResolver.resolveOptionalList(parsingContext, pkVar.f18104d, jSONObject17, "on_failed_actions", pVar7, pVar8);
                return new mk();
            case 16:
                ml mlVar = (ml) entityTemplate;
                JSONObject jSONObject18 = (JSONObject) obj;
                Field field14 = mlVar.f17876a;
                ij.p pVar9 = syVar.N2;
                ij.p pVar10 = syVar.L2;
                return new ll();
            case 17:
                ao aoVar = (ao) entityTemplate;
                JSONObject jSONObject19 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, aoVar.f16837a, jSONObject19, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, zn.f19278d, zn.f19275a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, aoVar.f16838b, jSONObject19, "blur", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, zn.f19279e, zn.f19276b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, aoVar.f16839c, jSONObject19, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, zn.f19277c);
                return new yn();
            case 18:
                kp kpVar = (kp) entityTemplate;
                JSONObject jSONObject20 = (JSONObject) obj;
                Field field15 = kpVar.f17608a;
                TypeHelper<Long> typeHelper8 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function18 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject20, "end", typeHelper8, function18);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, kpVar.f17610c, jSONObject20, "start", typeHelper8, function18);
                Field field16 = kpVar.f17611d;
                ij.p pVar11 = syVar.W2;
                ij.p pVar12 = syVar.U2;
                return new nd();
            case 19:
                lp lpVar = (lp) entityTemplate;
                JSONObject jSONObject21 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, lpVar.f17744a, jSONObject21, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
                Field field17 = lpVar.f17745b;
                TypeHelper<Long> typeHelper9 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function19 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject21, "font_size", typeHelper9, function19, np.f18008g, np.f18002a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, lpVar.f17746c, jSONObject21, "font_size_unit", np.f18006e, hn.f17349o, np.f18003b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, lpVar.f17747d, jSONObject21, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, lpVar.f17748e, jSONObject21, "font_weight", np.f18007f, w9.f18848w);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, lpVar.f17749f, jSONObject21, "font_weight_value", typeHelper9, function19, np.f18009h);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, lpVar.f17750g, jSONObject21, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, np.f18004c);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, lpVar.i, jSONObject21, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, np.f18005d);
                return new cp();
            case 20:
                xp xpVar = (xp) entityTemplate;
                JSONObject jSONObject22 = (JSONObject) obj;
                Field field18 = xpVar.f19059a;
                ij.p pVar13 = syVar.f18522s1;
                ij.p pVar14 = syVar.f18503q1;
                JsonFieldResolver.resolveOptionalList(parsingContext, xpVar.f19063e, jSONObject22, "swipe_out_actions", syVar.f18464m1, syVar.f18443k1);
                return new zf();
            case 21:
                uq uqVar = (uq) entityTemplate;
                JSONObject jSONObject23 = (JSONObject) obj;
                JsonFieldResolver.resolveExpression(parsingContext, uqVar.f18706a, jSONObject23, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                if (((hq) JsonFieldResolver.resolveOptional(parsingContext, uqVar.f18707b, jSONObject23, "style", syVar.C7, syVar.A7)) == null) {
                    Expression expression8 = gq.f17303a;
                }
                JsonFieldResolver.resolveOptionalExpression(parsingContext, uqVar.f18708c, jSONObject23, "unit", gq.f17305c, hn.f17349o, gq.f17303a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, uqVar.f18709d, jSONObject23, "width", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, gq.f17306d, gq.f17304b);
                return new fq();
            case 22:
                mr mrVar = (mr) entityTemplate;
                JSONObject jSONObject24 = (JSONObject) obj;
                JsonFieldResolver.resolveExpression(parsingContext, mrVar.f17913b, jSONObject24, "title", TypeHelpersKt.TYPE_HELPER_STRING);
                return new zf();
            case 23:
                nr nrVar = (nr) entityTemplate;
                JSONObject jSONObject25 = (JSONObject) obj;
                Field field19 = nrVar.f18010a;
                ij.p pVar15 = syVar.f18575x3;
                ij.p pVar16 = syVar.f18554v3;
                if (((cd) JsonFieldResolver.resolveOptional(parsingContext, field19, jSONObject25, "height", pVar15, pVar16)) == null) {
                    int i10 = jr.f17498a;
                }
                JsonFieldResolver.resolveExpression(parsingContext, nrVar.f18011b, jSONObject25, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
                if (((cd) JsonFieldResolver.resolveOptional(parsingContext, nrVar.f18012c, jSONObject25, "width", syVar.f18575x3, pVar16)) == null) {
                    int i11 = jr.f17498a;
                }
                return new br();
            case 24:
                or orVar = (or) entityTemplate;
                JSONObject jSONObject26 = (JSONObject) obj;
                Field field20 = orVar.f18044a;
                TypeHelper<Integer> typeHelper10 = TypeHelpersKt.TYPE_HELPER_COLOR;
                Function1<Object, Integer> function110 = ParsingConvertersKt.STRING_TO_COLOR_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field20, jSONObject26, "active_background_color", typeHelper10, function110, lr.f17752a);
                Field field21 = orVar.f18045b;
                TypeHelper<JSONObject> typeHelper11 = TypeHelpersKt.TYPE_HELPER_DICT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field21, jSONObject26, "active_font_variation_settings", typeHelper11);
                Field field22 = orVar.f18046c;
                TypeHelper typeHelper12 = lr.f17761k;
                w9 w9Var = w9.f18848w;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field22, jSONObject26, "active_font_weight", typeHelper12, w9Var);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18047d, jSONObject26, "active_text_color", typeHelper10, function110, lr.f17753b);
                Field field23 = orVar.f18048e;
                TypeHelper<Long> typeHelper13 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function111 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field23, jSONObject26, "animation_duration", typeHelper13, function111, lr.f17766p, lr.f17754c);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18049f, jSONObject26, "animation_type", lr.f17762l, hn.G, lr.f17755d);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18050g, jSONObject26, "corner_radius", typeHelper13, function111, lr.f17767q);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.i, jSONObject26, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18052j, jSONObject26, "font_size", typeHelper13, function111, lr.f17768r, lr.f17756e);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18053k, jSONObject26, "font_size_unit", lr.f17763m, hn.f17349o, lr.f17757f);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18054l, jSONObject26, "font_weight", lr.f17764n, w9Var, lr.f17758g);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18055m, jSONObject26, "inactive_background_color", typeHelper10, function110);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18056n, jSONObject26, "inactive_font_variation_settings", typeHelper11);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18057o, jSONObject26, "inactive_font_weight", lr.f17765o, w9Var);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18058p, jSONObject26, "inactive_text_color", typeHelper10, function110, lr.f17759h);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18059q, jSONObject26, "item_spacing", typeHelper13, function111, lr.f17769s, lr.i);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18060r, jSONObject26, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, lr.f17760j);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, orVar.f18061s, jSONObject26, "line_height", typeHelper13, function111, lr.f17770t);
                return new dr();
            case 25:
                fu fuVar = (fu) entityTemplate;
                JSONObject jSONObject27 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalList(parsingContext, fuVar.f17230a, jSONObject27, "actions", syVar.f18464m1, syVar.f18443k1);
                JsonFieldResolver.resolveOptionalList(parsingContext, fuVar.f17231b, jSONObject27, DebugMeta.JsonKeys.IMAGES, syVar.f18558v8, syVar.f18540t8);
                JsonFieldResolver.resolveOptionalList(parsingContext, fuVar.f17232c, jSONObject27, "ranges", syVar.f18529s8, syVar.f18508q8);
                JsonFieldResolver.resolveExpression(parsingContext, fuVar.f17233d, jSONObject27, "text", TypeHelpersKt.TYPE_HELPER_STRING);
                return new is();
            case 26:
                hu huVar = (hu) entityTemplate;
                JSONObject jSONObject28 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, huVar.f17366b, jSONObject28, "alignment_vertical", ws.f18930e, kr.f17620o, ws.f18926a);
                Field field24 = huVar.f17367c;
                ij.p pVar17 = syVar.f18575x3;
                ij.p pVar18 = syVar.f18554v3;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, huVar.f17368d, jSONObject28, "indexing_direction", ws.f18931f, kr.f17618m, ws.f18927b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, huVar.f17369e, jSONObject28, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, ws.f18928c);
                JsonFieldResolver.resolveExpression(parsingContext, huVar.f17370f, jSONObject28, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, ws.f18933h);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, huVar.f17371g, jSONObject28, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, huVar.f17372h, jSONObject28, "tint_mode", ws.f18932g, v0.C, ws.f18929d);
                JsonFieldResolver.resolveExpression(parsingContext, huVar.i, jSONObject28, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
                return new ms();
            case 27:
                jt jtVar = (jt) entityTemplate;
                JSONObject jSONObject29 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, jtVar.f17505a, jSONObject29, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, j6.f17476r);
                return new ht();
            case 28:
                iu iuVar = (iu) entityTemplate;
                JSONObject jSONObject30 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalList(parsingContext, iuVar.f17428a, jSONObject30, "actions", syVar.f18464m1, syVar.f18443k1);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17429b, jSONObject30, "alignment_vertical", kt.f17636d, kr.f17620o);
                Field field25 = iuVar.f17431d;
                TypeHelper<Double> typeHelper14 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
                Function1<Number, Double> function112 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field25, jSONObject30, "baseline_offset", typeHelper14, function112, kt.f17633a);
                Field field26 = iuVar.f17433f;
                TypeHelper<Long> typeHelper15 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function113 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field26, jSONObject30, "end", typeHelper15, function113, kt.i);
                Field field27 = iuVar.f17434g;
                TypeHelper<String> typeHelper16 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field27, jSONObject30, "font_family", typeHelper16);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17435h, jSONObject30, "font_feature_settings", typeHelper16);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.i, jSONObject30, "font_size", typeHelper15, function113, kt.f17641j);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17436j, jSONObject30, "font_size_unit", kt.f17637e, hn.f17349o, kt.f17634b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17437k, jSONObject30, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17438l, jSONObject30, "font_weight", kt.f17638f, w9.f18848w);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17439m, jSONObject30, "font_weight_value", typeHelper15, function113, kt.f17642k);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17440n, jSONObject30, "letter_spacing", typeHelper14, function112);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17441o, jSONObject30, "line_height", typeHelper15, function113, kt.f17643l);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17443q, jSONObject30, "start", typeHelper15, function113, kt.f17644m, kt.f17635c);
                Field field28 = iuVar.f17444r;
                TypeHelper typeHelper17 = kt.f17639g;
                mg mgVar = mg.f17856o;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field28, jSONObject30, "strike", typeHelper17, mgVar);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17445s, jSONObject30, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17447u, jSONObject30, "top_offset", typeHelper15, function113, kt.f17645n);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, iuVar.f17448v, jSONObject30, "underline", kt.f17640h, mgVar);
                return new ns();
            default:
                mu muVar = (mu) entityTemplate;
                JSONObject jSONObject31 = (JSONObject) obj;
                Field field29 = muVar.f17915a;
                TypeHelper<Long> typeHelper18 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function114 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field29, jSONObject31, "duration", typeHelper18, function114, lu.f17775b, lu.f17774a);
                Field field30 = muVar.f17916b;
                ij.p pVar19 = syVar.f18464m1;
                ij.p pVar20 = syVar.f18443k1;
                JsonFieldResolver.resolveOptionalList(parsingContext, field30, jSONObject31, "end_actions", pVar19, pVar20);
                JsonFieldResolver.resolveOptionalList(parsingContext, muVar.f17918d, jSONObject31, "tick_actions", syVar.f18464m1, pVar20);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, muVar.f17919e, jSONObject31, "tick_interval", typeHelper18, function114, lu.f17776c);
                return new ku();
        }
    }
}
