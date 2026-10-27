# CMSC 120 — Graphics

The starter for the graphics week of CMSC 120, Fall 2026: Pyret's images,
for Java.

- `src/Tricolor.java` — a flag of three stripes, with its checks. Run it first.
- `src/Img.java` — `Img.rectangle(...)`, `Img.beside(...)`, `Img.show(...)` and
  the rest: the shapes A1's flags were drawn with. Keep it beside your files
  and do not edit it. The comment at its top lists everything it has.
- `src/Check.java` — `Check.is(...)`, as in every Java week.
- `src/Lists.java` — `Lists.filter`, `Lists.map` and `Lists.fold`, Pyret's three,
  in Pyret's order. Keep it beside your files and do not edit it.
- `src/Reading.java` — runs the reading's own programs, which are in
  `src/chap03/` and the folders beside it (Drue Coles' listings, CC0,
  unchanged).
- `pom.xml` — names JavaFX, the library underneath `Img` and the reading's
  programs. IDEA reads it and fetches JavaFX. Not yours to change.

## In IntelliJ IDEA

From the project IDEA opens with: the menu button (☰, top left) → **File** →
**New** → **Project from Version Control…** → paste this repository's URL →
**Clone**.
If IDEA asks whether to load the Maven project, say yes, and wait for it to
finish fetching. Then open `src/Tricolor.java` and press the green Run arrow
beside `main`: a window opens with the flag in it, and the program ends when
you close it.

*JavaFX prints a few lines starting with `WARNING:` in red as it starts. They
are about JavaFX, not about your code.*
