function trackRobot(instructions) {

    let direction;
    let value = 0;
    let x = 0;
    let y = 0;

    instructions.forEach(e => {
        // console.log(e)
        direction = e.split(" ")[0]
        console.log(direction)

        value = parseInt(e.split(" ")[1])
        console.log(value)

        if (direction == "right") {
            x += value
        } else if (direction == "up") {
            y += value
        } else if (direction == "left") {
            x -= value;
        } else if (direction == "down") {
            y -= value
        }
    })
    return [x, y]
}
console.log(trackRobot(["right 100", "up 10", "left 20", "down 20"]))
