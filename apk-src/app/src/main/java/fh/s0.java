package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.sentry.metrics.MetricsUnit;
import io.sentry.protocol.Device;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18286a;

    public /* synthetic */ s0(int i) {
        this.f18286a = i;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public final Object resolve(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        switch (this.f18286a) {
            case 0:
                u0 u0Var = (u0) entityTemplate;
                JSONObject jSONObject = (JSONObject) obj;
                Field field = u0Var.f18666a;
                TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "bottom", typeHelper, function1, t0.f18606e, t0.f18602a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, u0Var.f18667b, jSONObject, RRWebVideoEvent.JsonKeys.LEFT, typeHelper, function1, t0.f18607f, t0.f18603b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, u0Var.f18668c, jSONObject, "right", typeHelper, function1, t0.f18608g, t0.f18604c);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, u0Var.f18669d, jSONObject, RRWebVideoEvent.JsonKeys.TOP, typeHelper, function1, t0.f18609h, t0.f18605d);
                return new p0();
            case 1:
                a1 a1Var = (a1) entityTemplate;
                JSONObject jSONObject2 = (JSONObject) obj;
                Field field2 = a1Var.f16788a;
                TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject2, "description", typeHelper2);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, a1Var.f16789b, jSONObject2, "hint", typeHelper2);
                Field field3 = a1Var.f16790c;
                TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
                Function1<Object, Boolean> function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject2, "is_checked", typeHelper3, function12);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, a1Var.f16791d, jSONObject2, "mode", z0.f19192c, v0.f18719g, z0.f19190a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, a1Var.f16792e, jSONObject2, "mute_after_action", typeHelper3, function12, z0.f19191b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, a1Var.f16793f, jSONObject2, "state_description", typeHelper2);
                return new y0();
            case 2:
                x4 x4Var = (x4) entityTemplate;
                JSONObject jSONObject3 = (JSONObject) obj;
                Field field4 = x4Var.f18983a;
                TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonFieldResolver.resolveExpression(parsingContext, field4, jSONObject3, "name", typeHelper4);
                JsonFieldResolver.resolveExpression(parsingContext, x4Var.f18984b, jSONObject3, "value", typeHelper4);
                return new g8.g(25);
            case 3:
                JsonFieldResolver.resolveExpression(parsingContext, ((q7) entityTemplate).f18149a, (JSONObject) obj, MetricsUnit.Fraction.RATIO, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17462c);
                return new p7();
            case 4:
                ha haVar = (ha) entityTemplate;
                JSONObject jSONObject4 = (JSONObject) obj;
                Field field5 = haVar.f17330a;
                TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function13 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject4, "bottom-left", typeHelper5, function13, j6.f17467h);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, haVar.f17331b, jSONObject4, "bottom-right", typeHelper5, function13, j6.i);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, haVar.f17332c, jSONObject4, "top-left", typeHelper5, function13, j6.f17468j);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, haVar.f17333d, jSONObject4, "top-right", typeHelper5, function13, j6.f17469k);
                return new ga();
            case 5:
                kb kbVar = (kb) entityTemplate;
                JSONObject jSONObject5 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, kbVar.f17571a, jSONObject5, "unit", jb.f17487b, hn.f17349o, jb.f17486a);
                JsonFieldResolver.resolveExpression(parsingContext, kbVar.f17572b, jSONObject5, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
                return new ib();
            case 6:
                vb vbVar = (vb) entityTemplate;
                JSONObject jSONObject6 = (JSONObject) obj;
                Field field6 = vbVar.f18759a;
                TypeHelper<Long> typeHelper6 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function14 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject6, "bottom", typeHelper6, function14, ub.f18683g, ub.f18677a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, vbVar.f18760b, jSONObject6, "end", typeHelper6, function14, ub.f18684h);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, vbVar.f18761c, jSONObject6, RRWebVideoEvent.JsonKeys.LEFT, typeHelper6, function14, ub.i, ub.f18678b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, vbVar.f18762d, jSONObject6, "right", typeHelper6, function14, ub.f18685j, ub.f18679c);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, vbVar.f18763e, jSONObject6, "start", typeHelper6, function14, ub.f18686k);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, vbVar.f18764f, jSONObject6, RRWebVideoEvent.JsonKeys.TOP, typeHelper6, function14, ub.f18687l, ub.f18680d);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, vbVar.f18765g, jSONObject6, "unit", ub.f18682f, hn.f17349o, ub.f18681e);
                return new tb();
            case 7:
                xb xbVar = (xb) entityTemplate;
                JSONObject jSONObject7 = (JSONObject) obj;
                return new wd.d();
            case 8:
                ad adVar = (ad) entityTemplate;
                JSONObject jSONObject8 = (JSONObject) obj;
                Field field7 = adVar.f16827a;
                TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonFieldResolver.resolveExpression(parsingContext, field7, jSONObject8, "key", typeHelper7, zc.f19211b);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, adVar.f16828b, jSONObject8, "placeholder", typeHelper7, zc.f19212c, zc.f19210a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, adVar.f16829c, jSONObject8, "regex", typeHelper7);
                return new sc();
            case 9:
                kd kdVar = (kd) entityTemplate;
                JSONObject jSONObject9 = (JSONObject) obj;
                Field field8 = kdVar.f17573a;
                TypeHelper<String> typeHelper8 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject9, "down", typeHelper8);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, kdVar.f17574b, jSONObject9, "forward", typeHelper8);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, kdVar.f17575c, jSONObject9, RRWebVideoEvent.JsonKeys.LEFT, typeHelper8);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, kdVar.f17576d, jSONObject9, "right", typeHelper8);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, kdVar.f17577e, jSONObject9, "up", typeHelper8);
                return new id();
            case 10:
                od odVar = (od) entityTemplate;
                JSONObject jSONObject10 = (JSONObject) obj;
                return new nd();
            case 11:
                JsonFieldResolver.resolveExpression(parsingContext, ((xg) entityTemplate).f19023a, (JSONObject) obj, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                return new wf();
            case 12:
                ch chVar = (ch) entityTemplate;
                JSONObject jSONObject11 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, chVar.f17020a, jSONObject11, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, bh.f16942a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, chVar.f17021b, jSONObject11, "label_id", TypeHelpersKt.TYPE_HELPER_STRING);
                return new ah();
            case 13:
                wh whVar = (wh) entityTemplate;
                JSONObject jSONObject12 = (JSONObject) obj;
                return new vh();
            case 14:
                di diVar = (di) entityTemplate;
                JSONObject jSONObject13 = (JSONObject) obj;
                JsonFieldResolver.resolveExpression(parsingContext, diVar.f17091a, jSONObject13, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                JsonFieldResolver.resolveExpression(parsingContext, diVar.f17092b, jSONObject13, "position", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17472n);
                return new of();
            case 15:
                JsonFieldResolver.resolveExpression(parsingContext, ((rk) entityTemplate).f18248a, (JSONObject) obj, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17474p);
                return new qk();
            case 16:
                sm smVar = (sm) entityTemplate;
                JSONObject jSONObject14 = (JSONObject) obj;
                JsonFieldResolver.resolveExpression(parsingContext, smVar.f18319a, jSONObject14, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
                JsonFieldResolver.resolveExpression(parsingContext, smVar.f18320b, jSONObject14, "position", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, j6.f17475q);
                return new of();
            case 17:
                mn mnVar = (mn) entityTemplate;
                JSONObject jSONObject15 = (JSONObject) obj;
                Field field9 = mnVar.f17883a;
                TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject15, "text", typeHelper9);
                JsonFieldResolver.resolveExpression(parsingContext, mnVar.f17884b, jSONObject15, "value", typeHelper9);
                return new of();
            case 18:
                wn wnVar = (wn) entityTemplate;
                JSONObject jSONObject16 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, wnVar.f18907a, jSONObject16, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, rn.f18251a);
                JsonFieldResolver.resolveOptionalExpression(parsingContext, wnVar.f18908b, jSONObject16, Device.JsonKeys.ORIENTATION, rn.f18253c, hn.f17344j, rn.f18252b);
                return new pn();
            case 19:
                uo uoVar = (uo) entityTemplate;
                JSONObject jSONObject17 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, uoVar.f18703a, jSONObject17, "unit", to.f18658b, hn.f17349o, to.f18657a);
                JsonFieldResolver.resolveExpression(parsingContext, uoVar.f18704b, jSONObject17, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, to.f18659c);
                return new so();
            case 20:
                gu guVar = (gu) entityTemplate;
                JSONObject jSONObject18 = (JSONObject) obj;
                JsonFieldResolver.resolveOptionalExpression(parsingContext, guVar.f17309a, jSONObject18, "description", TypeHelpersKt.TYPE_HELPER_STRING);
                return new ks();
            case 21:
                JsonFieldResolver.resolveOptionalExpression(parsingContext, ((ot) entityTemplate).f18068a, (JSONObject) obj, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, nt.f18013a);
                return new mt();
            default:
                uw uwVar = (uw) entityTemplate;
                JSONObject jSONObject19 = (JSONObject) obj;
                Field field10 = uwVar.f18717a;
                TypeHelper<Long> typeHelper10 = TypeHelpersKt.TYPE_HELPER_INT;
                Function1<Number, Long> function15 = ParsingConvertersKt.NUMBER_TO_INT;
                JsonFieldResolver.resolveExpression(parsingContext, field10, jSONObject19, "height", typeHelper10, function15, j6.f17477s);
                JsonFieldResolver.resolveExpression(parsingContext, uwVar.f18718b, jSONObject19, "width", typeHelper10, function15, j6.f17478t);
                return new tw();
        }
    }
}
